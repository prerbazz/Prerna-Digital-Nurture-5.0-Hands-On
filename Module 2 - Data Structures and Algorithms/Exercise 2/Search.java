package dsa.exercise2;

public class Search {
    public static Product linearSearch(Product[] products,int id){

        for(Product p:products){
            if(p.getProductId()==id){
                return p;
            }
        }

        return null;
    }

    public static Product binarySearch(Product[] products,int id){

        int low=0;
        int high=products.length-1;

        while(low<=high){

            int mid=(low+high)/2;

            if(products[mid].getProductId()==id){
                return products[mid];
            }

            if(products[mid].getProductId()<id){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return null;
    }
}