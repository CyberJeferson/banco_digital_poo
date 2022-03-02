import java.util.Scanner;
public class desafio {
    	public static void main(String[] args) {
           
		Scanner leitor = new Scanner(System.in);
		int N = leitor.nextInt();
                String entrada[] = new String[N + 1];
                String saida[] = new String[N + 1];
		for (int i = 0; i < N+ 1; i++) {       
                entrada[i] = leitor.nextLine();   
		}
                int iCarac,caso,totalsaida;
                String texto1,texto2;
                boolean primeiro;
                for(int j = 0;j < entrada.length;j++){                    
                    iCarac = 0;
                    primeiro = true;
                    texto1 = "";
                    texto2 = "";
               
                    while(iCarac < entrada[j].length()){
                    if(entrada[j].charAt(iCarac) != ' ' && primeiro == true){
                        texto1 = texto1 + entrada[j].charAt(iCarac);
                    }else{
                        primeiro = false;
                        if(entrada[j].charAt(iCarac) != ' '){
                            texto2 = texto2 + entrada[j].charAt(iCarac);
                        }
                      
                        
                    }
                            
                    iCarac++;
                    }
           
                      if(texto1.length() == texto2.length()){
                            totalsaida = texto1.length();
                            caso = 0;
                      }else{
                        if(texto1.length() > texto2.length()){
                            totalsaida = texto1.length();
                            caso = 1;
                        }else{
                            totalsaida = texto2.length();
                            caso = 2;
                        }
                      }
              saida[j] = "";
            
               
             switch(caso){
                 case 0:
                       iCarac = 0;
                     while(iCarac < texto1.length()){
                         saida[j] = saida[j] + texto1.charAt(iCarac) + texto2.charAt(iCarac);
                         iCarac++;
                     }
                     break;
                 case 1:
                       iCarac = 0;
                     while(iCarac < texto1.length()){
                         if(iCarac < texto2.length()){
                          saida[j] = saida[j] + texto1.charAt(iCarac) + texto2.charAt(iCarac);   
                         }else{
                             saida[j] = saida[j] + texto1.charAt(iCarac);
                         }
                         
                         iCarac++;
                     }
                     break;
                 case 2:
                       iCarac = 0;
                       while(iCarac < texto2.length()){
                         if(iCarac < texto1.length()){
                          saida[j] = saida[j] + texto1.charAt(iCarac) + texto2.charAt(iCarac);   
                         }else{
                             saida[j] = saida[j] + texto2.charAt(iCarac);
                         }                         
                         iCarac++;
                     }
                 break;
             }
                   System.out.println(saida[j]);
                }
               
                
	}
}
