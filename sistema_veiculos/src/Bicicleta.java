public class Bicicleta extends Veiculos {
    //Definição dos atributos privados
    private String marca;
    private String material;
    private int qntd_marchas;
    private String amortecedor;

    //Definição dos construtores públicos
    public Bicicleta(){}

    public Bicicleta(String marca, String material, int qntd_marchas, String amortecedor){
        this.marca=marca;
        this.material=material;
        this.qntd_marchas=qntd_marchas;
        this.amortecedor=amortecedor;
    }

    //Getters e setter dos atributos da bicicleta
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) throws AtributoInvalidoException {
        //Condicional de validação, que caso o atributo seja nulo dará erro
        if(marca==null || marca.trim().isEmpty()){
            throw new AtributoInvalidoException("A marca digitada deve ser válida");
        }
        else{
            this.marca = marca;
        }
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) throws AtributoInvalidoException {
        //Condicional de validação, que caso o atributo seja nulo dará erro
        if(material==null || material.trim().isEmpty()){
            throw new AtributoInvalidoException("O material digitado deve deve válido");
        }
        this.material = material;
    }

    public int getQntd_marchas() {
        return qntd_marchas;
    }

    public void setQntd_marchas(int qntd_marchas) throws AtributoInvalidoException {
        //Condicional de validação, que caso a quantidade de marchas seja menor que 1, dará erro
        if(qntd_marchas<1){
            throw new AtributoInvalidoException("A quantidade de marchas digitadas deve ser maior que 1");
        }
        else{
            this.qntd_marchas = qntd_marchas;
        }
    }

    public String getAmortecedor() {
        return amortecedor;
    }

    public void setAmortecedor(String amortecedor) throws AtributoInvalidoException {
        //Condicional de validação, que caso o atributo seja nulo dará erro
        if(amortecedor==null|| amortecedor.trim().isEmpty()){
            throw new AtributoInvalidoException("O tipo de amortecedor digitado é inválido");
        }
        this.amortecedor = amortecedor;
    }

    //Método string que retorna as informações da superclasse adicionando as informações dos atributos específicos
   @Override
    public String descricao(){
        return "\ndados da bicicleta: "+super.descricao() + "\nQuantidade de marchas: "+getQntd_marchas();
    }
}
