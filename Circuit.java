import java.util.List;

public class Circuit extends AST {
    Environment env;
    List<Simulation> inputs;
    List<Simulation> outputs;
    List<Latch> Latches;
    List<Assignment> Assignments;

    Circuit() {
        this.env = new Environment();
    }

public void initialize(){
    for (Latch l:Latches) {
        Latches.add(l);
        //put all latches in list of latches

        this.env.setVariable(l.output, false);
    }

}

public void nextCycle(Boolean result) {
    for (Latch l:Latches) {
        this.env.setVariable(l.input, result);
    }
}


public void runSimulation(){
    initialize();
    //while we have inputs
    for (Simulation input: inputs) {
        for (int i = 0; i < input.binary.size(); i++) {
            env.setVariable(input.identifier, input.binary.get(i));
            for (Assignment assignment : Assignments) {
                nextCycle(assignment.e.eval(env));
                System.out.println(assignment.e.eval(env));
                // traverse assignments return the values of the expression
                // at given time set it as input for latch next cycle

            }
        }

    }
    }
   /* we need to traverse our list of expressions,
      and update our latches, with the output of the expressions
      and then save the output of the latch as the input for the next cycle
    */
}