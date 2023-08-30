package day8;


    class static_binding{

        private void eat(){
            System.out.println("Dog is eating");
        
        }
        
        public static void main(String[] args) {
            static_binding dog = new static_binding();
            dog.eat();
        }
    
}
