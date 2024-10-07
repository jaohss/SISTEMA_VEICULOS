public class Skate extends Veiculos {
    //Definição dos atributos privados
    private String marca;
    private String tipo_roda;

    //Definição dos construtores públicos
    public Skate(){}

    public Skate(String marca, String tipo_roda){
        this.marca=marca;
        this.tipo_roda=tipo_roda;
    }

    //Getters e setters dos atributos do skate
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) throws AtributoInvalidoException {
        //Condicional de validação, que caso a kilometragem seja menor que 0, dará erro
        if(marca==null || marca.trim().isEmpty()){
            throw new AtributoInvalidoException("Marca digitada inválida");
        }
        else{
            this.marca = marca;
        }
    }

    public String getTipo_roda() {
        return tipo_roda;
    }

    public void setTipo_roda(String tipo_roda) throws AtributoInvalidoException {
        //Condicional de validação, que caso a kilometragem seja menor que 0, dará erro
        if(tipo_roda==null || tipo_roda.trim().isEmpty()){
            throw new AtributoInvalidoException("Tipo de roda digitada inválida");
        }
        this.tipo_roda = tipo_roda;
    }

    //Método string que retorna as informações da superclasse adicionando as informações dos atributos específicos
    @Override
    public String descricao(){
        return "\nDados do skate: "+super.descricao() + "\nMarca: " + getMarca() + "\n"+
        "Tipo de roda: "+getTipo_roda();
    }
    
}
