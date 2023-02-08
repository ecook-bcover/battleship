public class battleship{    
    public static void main(String[] args){
        //test for program start
        System.out.println("Program running");
        //create array to represent 'sea'
        byte seaArrayInit = 0;
        byte[] seaArray;
        seaArray = new byte[13];
        seaArray[0] = 0;
        while (seaArrayInit < 13){
            seaArray[seaArrayInit] = 0;
            // this used to test for array initialization
            // since the same purpose is accomplished in
            //the ship placemtent test, this has been removed
            //System.out.print(seaArray[seaArrayInit]);
            seaArrayInit++;
        }
        //generate random digit
        long randomSeed = (System.currentTimeMillis());
        long randomDigitLong = (randomSeed % (randomSeed / 10));
        byte randomDigitByte = (byte)randomDigitLong;
        //test for random digit
        System.out.println(randomDigitByte);
        //place ship in seaArray
        byte shipInit = 0;
        while (shipInit < 4){
            seaArray[randomDigitByte + shipInit] = 1;
            shipInit++;
        }
        //test ship placement
        byte shipPositionTest = 0;
        while (shipPositionTest < 13){
            System.out.print(seaArray[shipPositionTest]);
            shipPositionTest++;
        }
    }
}