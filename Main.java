public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if (hourOfDay>=0 && hourOfDay<=23 && barking){
            if(hourOfDay<8 || hourOfDay>22){
                System.out.println("true döndü");
                return true;
            }else{
                System.out.println("1.false döndü");
                return false;
            }
        } else{
            System.out.println("Invalid Value");
            return false;
        }
    }
