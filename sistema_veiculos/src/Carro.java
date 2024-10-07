public class Carro extends Automotores{
    //Definição dos atributos privados
    private int qntd_passageiros;
    private String tipo_airbag;
    private String tipo_freio;

    //Definição dos construtores públicos
    public Carro(){}

    public Carro(int qntd_passageiros, String tipo_airbag, String tipo_freio){
        this.tipo_airbag=tipo_airbag;
        this.tipo_freio=tipo_freio;
    }

    //Getters e setters dos atributos do carro
    public int getQntd_passageiros() {
        return qntd_passageiros;
    }

    public void setQntd_passageiros(int qntd_passageiros) throws AtributoInvalidoException {
        //Condicional de validação, que caso a quantidade de passageiros seja menor que 1, dará erro
        if(qntd_passageiros < 1){
            throw new AtributoInvalidoException("A quantidade de passageiros máxima deve ser maior que 1");
        }
        this.qntd_passageiros = qntd_passageiros;
    }

    public String getTipo_airbag() {
        return tipo_airbag;
    }

    public void setTipo_airbag(String tipo_airbag) throws AtributoInvalidoException {
        //Condicional de validação, que caso o atributo seja nulo dará erro
        if(tipo_airbag == null || tipo_airbag.trim().isEmpty()  ){
            throw new AtributoInvalidoException("O tipo de airbag digitado é inválido");
        }

        else{
            this.tipo_airbag = tipo_airbag;
        }
    }

    public String getTipo_freio() {
        return tipo_freio;
    }

    public void setTipo_freio(String tipo_freio) throws AtributoInvalidoException {
        //Condicional de validação, que caso o atributo seja nulo dará erro
        if(tipo_freio == null || tipo_freio.trim().isEmpty()){
            throw new AtributoInvalidoException("Tipo de freio digitado é inválido");
        }
        this.tipo_freio = tipo_freio;
    }

    //Método string que retorna as informações da superclasse adicionando as informações dos atributos específicos
    @Override
    public String descricao(){
        return "\nDados do carro: "+super.descricao() +"\nQuantidade de passageiros máxima: "+getQntd_passageiros() + "\nTipo de Airbag: "+getTipo_airbag()+ "\nTipo de freio: "+getTipo_freio();
    }
    
}