package classesUML;

public class Cartas {

		private int idCarta;

		public int getIdCarta() {
			return idCarta;
		}

		public void setIdCarta(int idCarta) {
			this.idCarta = idCarta;
		}

		public String getNomeCarta() {
			return nomeCarta;
		}

		public void setNomeCarta(String nomeCarta) {
			this.nomeCarta = nomeCarta;
		}

		public String getRequisitos() {
			return requisitos;
		}

		public void setRequisitos(String requisitos) {
			this.requisitos = requisitos;
		}

		public int getValorPontos() {
			return valorPontos;
		}

		public void setValorPontos(int valorPontos) {
			this.valorPontos = valorPontos;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		private String nomeCarta;

		private String requisitos;

		private int valorPontos;

		private String descricao;

		public void definirFuncao(Carta carta) {
		}

	}


