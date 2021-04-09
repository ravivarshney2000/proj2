public class bound {
    public static class ExceptionDemo
    {
        public static void main(String[] args)
        {
            System.out.println("Execution is start");
            try                    {
                String strg=args[0];
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("pls enter atleast one cmdLine argument");
            }
            System.out.println("Execution End");
        }
    }

}
