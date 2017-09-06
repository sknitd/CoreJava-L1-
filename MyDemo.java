/*-------------Assignment 14: Abstract classes and final modifier-----*/

/*-------------Objective : To understand the various modifiers used in the java language------*/

abstract class Demo
{
        protected static int count;
        private int number;
        abstract void getValues();
        
        final void displayValues()
        {
                
        }
        
        //final void compute(){ }
        
}

final class MyDemo extends Demo
{
        int value;
        //MyDemo(int temp){value = temp;}
        
        public static void main(String args[])
        {
                Demo object = new MyDemo();
        }
        void getValues(){}
        void compute(){}
        
        void incrementCount(){count++;}    /*This line could be uncommented without changing anything else in the code*/
        //void incrementNumber(){number++;}
}
