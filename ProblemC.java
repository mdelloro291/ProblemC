import java.util.Scanner;

public class ProblemC {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int planetCount = 0;
        int starSystemsCount = input.nextInt();
        int[] starSystemsResults = new int[starSystemsCount];
        int iterations;
        char[] planetsConverted;
        String planets;
        boolean allSafe = false;
        int startPlanet = 0;
        for(int x = 0; x < starSystemsCount; x++){
            iterations = 0;
            planetCount = input.nextInt();
            input.nextLine();
            planets = input.nextLine();
            planetsConverted = planets.toCharArray();

            do{
                //String planetsVerify = "";
                startPlanet = 0;
                for (char c : planetsConverted) {
                    if(c == '1'){
                        ++startPlanet;
                        //System.out.println(startPlanet);
                    }
                    else{
                        break;
                    }
                }
                /* 
                for (char c : planetsConverted) {
                    planetsVerify += c;
                }
                */
                //System.out.println("Iteration : " + planetsVerify);
                for(int y = startPlanet; y < planetCount; y++){
                    if(planetsConverted[y] == '1'){
                        planetsConverted[y] = '0';
                        //System.out.println("1 Flipped");
                    }
                    else{
                        planetsConverted[y] = '1';
                        //System.out.println("0 Flipped");
                    }
                }
				for(int z = 0; z < planetCount; z++){
					if(planetsConverted[z] == '0'){
						allSafe = false;
						break;
					}
					else if(z == planetCount - 1){
						allSafe = true;
					}
				}
                ++iterations;
                /* 
                planetsVerify = "";
                for (char c : planetsConverted) {
                    planetsVerify += c;
                }
                */
                //System.out.println("Flipped : " + planetsVerify);
            }while(allSafe == false);
            starSystemsResults[x] = iterations;
        }
        for (int min : starSystemsResults) {
            System.out.println(min);
            
        }
        input.close();
    }
}
