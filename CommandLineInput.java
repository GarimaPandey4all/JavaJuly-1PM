class CommandLineInput {
    public static void main(String[] arr) {
        
        int sum = 0;
        //Traditional Loop
        /*
        for(int i = 0; i < arr.length; i++)
        {
            sum += Integer.parseInt(arr[i]);
        }*/

        //Enhanced For loop / For each loop
        for(String i : arr)
        {
            sum += Integer.parseInt(i);
        }

        System.out.println("Sum is: "+sum); // + : Concatenation/Joining (String + 10)

        //System.out.println(sum);
    }
}
