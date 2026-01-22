public class StringMethods {
    static void main(String[] args) {

        String name = "Lucas da Silva Santos";
/*
        int length = name.length();
        char letter = name.charAt(9);
        int index = name.indexOf(letter);
        int lastIndex = name.lastIndexOf("s");

        name = name.toLowerCase();
        name = name.toUpperCase();
        name = name.trim();
        *//*name = name.replaceAll("l", "u");*//*

        name.isEmpty(); //Returns a boolean

        System.out.println(name);

        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);*/

      /*  if(name.isEmpty()){
            System.out.println("Your name is empty");
        } else {
            System.out.println("Your name is " + name);
        }

        if(name.contains("S")){
            System.out.println("Your name contains S");
        } else  {
            System.out.println("Your name does not contains S");
        }*/

        if (name.equals("Lucas da Silva Santos")) {
            System.out.println("Your name is ok");
        } else {
            System.out.println("Your name is wrong");
        }
    }
}
