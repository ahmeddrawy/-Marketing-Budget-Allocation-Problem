package GA_2;

import java.util.Vector;

public class Chromosome {
    Vector<Double> genes;
    int size = 0 ;
    Validator validator = new DefaultValidator() ;
    Chromosome(int sz ){
        genes = new Vector<>(sz);
        size = sz;
    }

    public void setValidator(Validator validator) {
        this.validator = validator;
    }
    public boolean validate(){
        return this.validator.validate(this);
    }
    public int getSize() {
        return size;
    }
    public double getSum (){
        double ret =0 ;
        for (int i = 0; i <size ; i++) {
            ret += genes.get(i);
        }
        return ret;
    }
    public double getGene(int indx){
        if(indx < size)
            return genes.get(indx);
        // TODO: 11/21/2020 handle out of bound access

        return 0 ;
    }
    public Vector<Double> getGenes() {
        return genes;
    }
}
