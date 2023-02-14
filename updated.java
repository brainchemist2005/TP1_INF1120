
/**
 * 
 * 
 * 
 * @author bouz90340206
 * @version 7/02/2023
 */


public class updated {
	
	public static void main(String[] args)
	{
		char Choix;
		double Facture = 0,Recette = 0,N_Factture = 0;
    	final int MAX = 10, MIN =0;
    	final double ENFANT = 11.52// 0 à 6 ans
    	,PETIT_J = 33.92, PETIT_J_S = 38.92, PETIT_S = 22.18 // 7 à 12 ans
    	,ADO_JJ = 42.62 ,ADO_JJ_S = 47.84 ,ADO_JS = 26.31 // 13 à 24 ans
    	,ADULTE_J = 56.53, ADULTE_J_S = 61.75, ADULTE_S = 32.62// 25 à 69 ans
    	,VIEUX_J = 37.40, VIEUX_J_S = 37.40, VIEUX_S = 26.31;//70 ans et plus
    	
    	// J désigne jour ; J_S désigne jour et soirée ; S désigne soirée
    	int Nombre;
    	
		do
		{
		System.out.println(
					"====\nMENU\n====\n"
					+ "1. Vente de billets\n"
					+ "2. Consultation des Recettes\n"
					+ "3. Reinitialisation\n"
					+ "4. Quitter");
		
		System.out.println("Entrez votre choix: ");
		Choix = Clavier.lireCharLn();
		
		
		switch(Choix)
		{
		case '1':
			do
			{
				System.out.println("----------------\n"
						+ "VENTE DE BILLETS\n"
						+ "----------------\n"
						+ "\n"
						+ "Periodes :\n"
						+ "  A. Jour\n"
						+ "  B. Jour et soir\n"
						+ "  C. Soiree\n"
						+ "  D. TerMINer");
				
				Choix = Clavier.lireCharLn();
				Choix = Character.toUpperCase(Choix);
			
			switch(Choix)
			{
				case 'A' :
			            do
							{
								System.out.println("Tranches d'ages :\n"
										+ "  A. 0 - 6\n"
										+ "  B. 7 - 12\n"
										+ "  C. 13 - 24\n"
										+ "  D. 25 - 69\n"
										+ "  E. 70 et +\n"
										+ "  F. TerMINer");
								
								Choix = Clavier.lireCharLn();
								Choix = Character.toUpperCase(Choix);

							
							if(Choix == 'A')
							{
								System.out.println("Entrez le Nombre de billets : ");
								Nombre = Clavier.lireInt();
								if(Nombre >= MAX || Nombre < MIN)
								{
									System.out.println("ERREUR. Vous devez entrer un Nombre entre 0 et 9 inclusivement. Recommencez...");
								}	
								
								else
								{
									System.out.printf("AJOUT DE %d BILLET(S) 0  - 6  ans | JOUR\n", Nombre);
									Facture = Facture + ( ENFANT * Nombre);
								}
							}
							
							else if (Choix == 'B')
							{
								System.out.println("Entrez le Nombre de billets : ");
								Nombre = Clavier.lireInt();
								if(Nombre >= MAX || Nombre < MIN)
								{
									System.out.println("ERREUR. Vous devez entrer un Nombre entre 0 et 9 inclusivement. Recommencez...");
								}	
								
								else
								{
									System.out.printf("AJOUT DE %d BILLET(S) 7  - 12  ans | JOUR\n", Nombre);
									
									Facture = Facture + ( PETIT_J * Nombre);
								}
							}
							
							else if (Choix == 'C')
							{
								System.out.println("Entrez le Nombre de billets : ");
								Nombre = Clavier.lireInt();
								if(Nombre >= MAX || Nombre < MIN)
								{
									System.out.println("ERREUR. Vous devez entrer un Nombre entre 0 et 9 inclusivement. Recommencez...");
								}	
								
								else
								{
									System.out.printf("AJOUT DE %d BILLET(S) 13  - 24  ans | JOUR\n", Nombre);
								
									Facture = Facture + ( ADO_JJ * Nombre);
								}
							}
							
							else if(Choix == 'D')
							{
								System.out.println("Entrez le Nombre de billets : ");
								Nombre = Clavier.lireInt();
								if(Nombre >= MAX || Nombre < MIN)
								{
									System.out.println("ERREUR. Vous devez entrer un Nombre entre 0 et 9 inclusivement. Recommencez...");
								}	
								
								else
								{
									System.out.printf("AJOUT DE %d BILLET(S) 25 - 69  ans | JOUR\n", Nombre);
								
									Facture = Facture + ( ADULTE_J * Nombre);
								}
							}
							
							else if(Choix == 'E')
							{
								System.out.println("Entrez le Nombre de billets : ");
								Nombre = Clavier.lireInt();
								if(Nombre >= MAX || Nombre < MIN)
								{
									System.out.println("ERREUR. Vous devez entrer un Nombre entre 0 et 9 inclusivement. Recommencez...");
									 
								}	
								
								else
								{
									System.out.printf("AJOUT DE %d BILLET(S) 70 et + ans | JOUR\n", Nombre);
								
									Facture = Facture + ( VIEUX_J * Nombre);
								}
							}
							
							else if(Choix == 'F')
							{
							}
								
							else
								System.out.println("ERREUR. Vous devez entrer une lettre entre A et F. Recommencez...");
								
							
							}while(Choix != 'F');
			            break;
			            
				case 'B':
			            do
							{
								System.out.println("Tranches d'ages :\n"
										+ "  A. 0 - 6\n"
										+ "  B. 7 - 12\n"
										+ "  C. 13 - 24\n"
										+ "  D. 25 - 69\n"
										+ "  E. 70 et +\n"
										+ "  F. TerMINer");
								
								Choix = Clavier.lireCharLn();
								Choix = Character.toUpperCase(Choix);
								
							if(Choix == 'A')
							{
								System.out.println("Entrez le Nombre de billets : ");
								Nombre = Clavier.lireInt();
								
								if(Nombre >= MAX || Nombre < MIN)
								{
									System.out.println("ERREUR. Vous devez entrer un Nombre entre 0 et 9 inclusivement. Recommencez...");
									 
								}	
								
								else
								{
									System.out.printf("AJOUT DE %d BILLET(S) 0  - 6  ans | JOUR / SOIR\n", Nombre);
								
								
									Facture = Facture + ( ENFANT * Nombre);
								}
							}
							
							else if (Choix == 'B')
							{
								System.out.println("Entrez le Nombre de billets : ");
								Nombre = Clavier.lireInt();
								if(Nombre >= MAX || Nombre < MIN)
								{
									System.out.println("ERREUR. Vous devez entrer un Nombre entre 0 et 9 inclusivement. Recommencez...");
									 
								}
								
								else
								{
									System.out.printf("AJOUT DE %d BILLET(S) 7 - 12 ans | JOUR / SOIR\n", Nombre);

									Facture = Facture + ( PETIT_J_S * Nombre);
								}
							}
							
							else if (Choix == 'C')
							{
								System.out.println("Entrez le Nombre de billets : ");
								Nombre = Clavier.lireInt();
								if(Nombre >= MAX || Nombre < MIN)
								{
									System.out.println("ERREUR. Vous devez entrer un Nombre entre 0 et 9 inclusivement. Recommencez...");
								}	
								
								else
								{
									System.out.printf("AJOUT DE %d BILLET(S) 13 - 24  ans | JOUR / SOIR\n", Nombre);

									Facture = Facture + ( ADO_JJ_S * Nombre);
								}
							}
							
							else if(Choix == 'D' || Choix == 'd')
							{
								System.out.println("Entrez le Nombre de billets : ");
								Nombre = Clavier.lireInt();
								if(Nombre >= MAX || Nombre < MIN)
								{
									System.out.println("ERREUR. Vous devez entrer un Nombre entre 0 et 9 inclusivement. Recommencez...");
								}	
								
								else
								{
									System.out.printf("AJOUT DE %d BILLET(S) 25 - 69  ans | JOUR / SOIR\n", Nombre);

									Facture = Facture + ( ADULTE_J_S * Nombre);
								}
							}
							
							else if(Choix == 'E')
							{
								System.out.println("Entrez le Nombre de billets : ");
								Nombre = Clavier.lireInt();
								if(Nombre >= MAX || Nombre < MIN)
								{
									System.out.println("ERREUR. Vous devez entrer un Nombre entre 0 et 9 inclusivement. Recommencez...");
								}	
								
								else
								{
									System.out.printf("AJOUT DE %d BILLET(S) 70 et +   ans | JOUR / SOIR\n", Nombre);

									Facture = Facture + ( VIEUX_J_S * Nombre);
								}
							}
							
							else if(Choix == 'F')
							{}
								
							else
								System.out.println("ERREUR. Vous devez entrer une lettre entre A et F. Recommencez...");
							
							}while(Choix != 'F');
			            break;
			        

			case 'C':
			            do
							{
							System.out.println("Tranches d'ages :\n"
									+ "  A. 0 - 6\n"
									+ "  B. 7 - 12\n"
									+ "  C. 13 - 24\n"
									+ "  D. 25 - 69\n"
									+ "  E. 70 et +\n"
									+ "  F. TerMINer");
							
							Choix = Clavier.lireCharLn();
							Choix = Character.toUpperCase(Choix);
							
							if(Choix == 'A')
							{
								System.out.println("Entrez le Nombre de billets : ");
								Nombre = Clavier.lireInt();
								if(Nombre >= MAX || Nombre < MIN)
								{
									System.out.println("ERREUR. Vous devez entrer un Nombre entre 0 et 9 inclusivement. Recommencez...");
								}	
								
								else
								{
									System.out.printf("AJOUT DE %d BILLET(S) 0 - 6  ans | SOIR\n", Nombre);

									Facture = Facture + ( ENFANT * Nombre);
								}
							}
							
							else if (Choix == 'B')
							{
								System.out.println("Entrez le Nombre de billets : ");
								Nombre = Clavier.lireInt();
								if(Nombre >= MAX || Nombre < MIN)
								{
									System.out.println("ERREUR. Vous devez entrer un Nombre entre 0 et 9 inclusivement. Recommencez...");
								}	
								
								else
								{
									System.out.printf("AJOUT DE %d BILLET(S) 7 - 12  ans | SOIR\n", Nombre);

									Facture = Facture + (PETIT_S * Nombre);
								}
							}
							
							else if (Choix == 'C')
							{
								System.out.println("Entrez le Nombre de billets : ");
								Nombre = Clavier.lireInt();
								if(Nombre >= MAX || Nombre < MIN)
								{
									System.out.println("ERREUR. Vous devez entrer un Nombre entre 0 et 9 inclusivement. Recommencez...");
								}	
								
								else
								{
									System.out.printf("AJOUT DE %d BILLET(S) 13 - 24  ans | SOIR\n", Nombre);

									Facture = Facture + (ADO_JS * Nombre);
								}
							}
							
							else if(Choix == 'D')
							{
								System.out.println("Entrez le Nombre de billets : ");
								Nombre = Clavier.lireInt();
								if(Nombre >= MAX || Nombre < MIN)
								{
									System.out.println("ERREUR. Vous devez entrer un Nombre entre 0 et 9 inclusivement. Recommencez...");
								}	
								
								else
								{
									System.out.printf("AJOUT DE %d BILLET(S) 25 - 69  ans | SOIR\n", Nombre);

									Facture = Facture + (ADULTE_S * Nombre);
								}
							}
							
							else if(Choix == 'E')
							{
								System.out.println("Entrez le Nombre de billets : ");
								Nombre = Clavier.lireInt();
								if(Nombre >= MAX || Nombre < MIN)
								{
									System.out.println("ERREUR. Vous devez entrer un Nombre entre 0 et 9 inclusivement. Recommencez...");
								}	
								
								else
								{
									System.out.printf("AJOUT DE %d BILLET(S)  70 et +  ans | SOIR\n", Nombre);

									Facture = Facture + (VIEUX_S * Nombre);
								}
							}
								
							else if(Choix == 'F')
							{}
								
							else
								System.out.println("ERREUR. Vous devez entrer une lettre entre A et F. Recommencez...");
			                
							
							}while(Choix != 'F');
			            	break;
					
				case 'D':
					if(Facture == 0)
						System.out.println("---> OPERATION ANNULEE <---");
					
					else
						System.out.println("La Facture: "+ Facture);
						
					break;
					
				default:
					System.out.println("ERREUR. Vous devez entrer une lettre entre A et D. Recommencez...");
					
			}
			
			
			}while(Choix != 'D');
			Recette += Facture;
			N_Factture++;
			break;
			
		case '2':
			System.out.println("CONSULTATION DES RecetteS\n" + Recette +"$");
			System.out.println("Appuyez sur <ENTREE> pour continuer...");
			Clavier.lireFinLigne();
			break;
			
		case '3':
			System.out.println("----------------\n"
					+ "REINITIALISATION\n"
					+ "----------------\n"
					+ "\n"
					+ "---> REINITIALISATION EFFECTUEE <---");
			Recette = 0;
			Facture = 0;
			N_Factture = 0;
			break;
			
		case '4':
			System.out.println("Vous avez décidé de quitter.");
			break;
			
			default: 
				System.out.println("Option invalide");
		}
		
		}while(Choix != '4');
		
		
	
}
}
