package day8;


    class static_binding{
        
        //private keyword means that this is a private method which means that to access this method we need to declare in the same class in which we want to access it.
        private void eat(){
            System.out.println("Dog is eating");
        
        }

        public static void main(String[] args) {
            static_binding dog = new static_binding();
            dog.eat();
        }
    
}
