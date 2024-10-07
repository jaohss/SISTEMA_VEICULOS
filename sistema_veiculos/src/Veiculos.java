public class Veiculos {
    //Definição dos atributos privados
    private String cor;
    private String modelo;
    private String ano_fabri;

    //Definição dos construtores públicos
    public Veiculos(){}

    public Veiculos(String cor, String modelo, String ano_fabri){
        this.cor=cor;
        this.modelo=modelo;
        this.ano_fabri=ano_fabri;
    }

    //Getters e setters
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) throws AtributoInvalidoException {
        //Condicional de validação, que caso o atributo seja nulo dará erro
        if (cor == null || cor.trim().isEmpty()) {
            throw new AtributoInvalidoException("A cor não pode ser nula ou vazia.");
        }
        else{
            this.cor = cor;
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) throws AtributoInvalidoException {
        //Condicional de validação, que caso o atributo seja nulo dará erro
        if(modelo == null || modelo.trim().isEmpty()){
            throw new AtributoInvalidoException("O modelo do veículo não pode ser nulo ou vazio.");
        }
        else{
            this.modelo = modelo;
        }
    }

    public String getAno_fabri() {
        return ano_fabri;
    }

    public void setAno_fabri(String ano_fabri) throws AtributoInvalidoException {
        //Condicional de validação, que caso o atributo seja nulo dará erro
        if(ano_fabri==null || ano_fabri.trim().isEmpty()){
            throw new AtributoInvalidoException("O ano de fabricação digitado deve ser válido");
        }
        else{
            this.ano_fabri = ano_fabri;
        }
    }

    //Método string que retorna as informações da superclasse
    public String descricao(){
        return "\nModelo: "+getModelo()+ "\n" +
        "Cor: "+getCor() +"\n" +
        "Ano de fabricação: " + getAno_fabri();
    }
}


