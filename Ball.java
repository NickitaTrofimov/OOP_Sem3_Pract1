public class Ball {
    String	size;
    String	collor;
    String jumping_ability;
    int	price;

    public void Set_Size(String s){
        this.size = s;
    }
    public void Set_Collor(String c){
        this.collor = c;
    }
    public void Set_Jumping_ability(String ja){
        this.jumping_ability = ja;
    }
    public void Set_Price(int p){
        this.price = p;
    }

    public	String	getSize()	{
        return	size;
    }
    public	String	getCollor()	{
        return	collor;
    }
    public	String	getJumping_ability() {
        return	jumping_ability;
    }
    public	int	getPrice()	{
        return	price;
    }

    Ball (String size, String collor, String jumping_ability, int price){
        this.size = size;
        this.collor = collor;
        this.jumping_ability = jumping_ability;
        this.price = price;
    }

    @Override
    public String toString(){
        return "Этот мяч "	+size+ ", он имеет "	+collor+	" цвет, прыгает он "
                +jumping_ability+ ", стоит он "	+price+	" рублей";
    }
}
