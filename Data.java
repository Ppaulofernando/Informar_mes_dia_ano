package total_dias_mes;

public class Data {
	int mes;
	int dia;
	int ano;
	
	
	public Data(int mes, int dia, int ano) {
		this.mes = mes;
		this.dia = dia;
		this.ano = ano;
	}

	public boolean validaData() {

		if(ano >= 0) {

			if((mes >= 1) && (mes <=12)) {

				if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
					if (dia >= 1 && dia <= 31) {
						System.out.println("ESte mês tem 31 dias");
						return true;
					}
					else {
						return false;
					}
				}
				else if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {

					if (dia >= 1 && dia <= 30) {
						System.out.println("ESte mês tem 30 dias");
						return true;
					}
					else {
						return false;
					}
				}
				else {
				//Mês de fevereiro
					if(ano % 4 != 0) { //Ano não é bissexto

						if(dia >= 1 && dia <= 28) {
							System.out.println("ESte mês tem 28 dias");
							return true;
						} else {
							return false;
						}
					}
					else if(ano % 4 == 0) {//Ano pode ser bissexto
						
						System.out.println("ESte mês tem 29 dias");

						if(ano % 100 != 0) { //Ano bissexto
							
							   if(dia >= 1 && dia <= 29) {
								return true;
							}
							else {
								return false;
								}
						}
						else {

							if(ano % 400 == 0) {
								return true;
							}
							else {
								return false;
							}
						}
					}
				} 
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
		return true;
	}


	public void mostrarData() {
		if(validaData()) {
			System.out.println(this.dia+"/"+this.mes+"/"+this.ano);	
		}
		else {
			System.out.println("Data não é válida.");
		}

	   }
	
}	
