    import java.util.Random;
    import java.util.ArrayList;

    public class Main {

        record Tuple(boolean Earthquake, boolean Burglar, boolean Alarm) {}











        public static void main(String []args){
            
            Random rand = new Random();
            ArrayList<Tuple> tuples = new ArrayList<>(); //list to store tuples of E, B, and A

            String msg = "\n\n\n";
            System.out.println(msg);
            
            boolean Earthquake;
            boolean Burglar;
            boolean Alarm;

            int num_runs = 10; //100,000 in final
            
            for(int i = 0; i < num_runs; i++){
                Earthquake = rand.nextInt(0, 110) < 1; //odds of earthquake are 1 in 110
                Burglar = rand.nextInt(0, 365) < 1; //odds of burglar are 1 in 365

                if(Earthquake && Burglar){
                    Alarm = rand.nextInt(0, 100) < 97; //97% odds of alarm during burglary and earthquake
                }
                else if(Earthquake){
                    Alarm = rand.nextInt(0, 100) < 81; //81% odds of alarm during earthquake
                }
                else if(Burglar){
                    Alarm = rand.nextInt(0, 100) < 92; //92% odds of alarm during burglary
                }
                else{
                    Alarm = rand.nextDouble(0, 100) < 0.95; //0.95% chance of false alarm
                }

                //store a tuple of E, B, and A in a list for later analysis
                tuples.add(new Tuple(Earthquake, Burglar, Alarm));
            }
            //print all tuples
            for (Tuple t : tuples) {
                System.out.println(t);
            }
            //check tuples based on conditions 1) (Among the tuples with A=1, what is the fraction where B=1?
            //2) Among the tuples with A=1 and E=1, what is the fraction where B=1?)
            for (Tuple t : tuples) {
                ///stub
            }

            System.out.println("Hello World");



            //non code portion (write answers somewhere else, prob a word doc):
            /*
            Give an interpretation to your answers for items 1 & 2. What probabilities do they approximate?
            Are they in line with your intuition? In other words, do they make sense? In particular: which of the fractions is bigger and why?
            Repeat the experiment a couple of times to get a feeling of how much the results change just by chance. (This is the nature of the Monte Carlo approximation.) Experiment with different values of n. How does it affect the variability?
            */





            System.out.println(msg);
        }



    }