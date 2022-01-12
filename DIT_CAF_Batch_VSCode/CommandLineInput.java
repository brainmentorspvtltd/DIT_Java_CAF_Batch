class CommandLineInput {

    public static void main(String[] args) {
        
        //Dynamic way of initialization: Command line input

        if(args.length == 2)
        {
            int firstNumber = Integer.parseInt(args[0]);
            int secondNumber = Integer.parseInt(args[1]);
            int result;

            result = firstNumber + secondNumber;

            System.out.println("sum is: "+result);
        }

        else {
            System.out.println("Invalid Input");
        }
    }
    
}
