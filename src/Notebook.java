public class Notebook {

    private String creator;
    private String operSystem;
    private int ozu;
    private int hardMemory;
    private String color;
    public Notebook (String creator, String operSystem, int ozu,int hardMemory, String color){
        this.color = color;
        this.hardMemory = hardMemory;
        this.operSystem = operSystem;
        this.creator = creator;
        this.ozu = ozu;

    }
    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass())
            return false;
        Notebook notebook = (Notebook) obj;
        boolean check = (ozu == notebook.ozu
                && creator.equals(notebook.creator)
                && operSystem.equals(notebook.operSystem)
                && hardMemory == notebook.hardMemory
                && color.equals(notebook.color));
        return check;
    }
    @Override
    public String toString(){
        return "Произврдитель " + creator + ", " +
                "Операционная система " + operSystem + ", " +
                "Объем жесткого диска " + hardMemory + "Гб , " +
                "Объем оперативной памяти " + ozu + "Гб , " +
                "Цвет корпуса " + color;

    }
    public void setColor(String color) {
        this.color = color;
    }



    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void setHardMemory(int hardMemory) {
        this.hardMemory = hardMemory;
    }



    public void setOperSystem(String operSystem) {
        this.operSystem = operSystem;
    }

    public int getHardMemory() {
        return hardMemory;
    }

    public int getOzu() {
        return ozu;
    }

    public String getColor() {
        return color;
    }


    public String getCreator() {
        return creator;
    }



    public String getOperSystem() {
        return operSystem;
    }

    public void setOzu(int ozu) {
        this.ozu = ozu;
    }

}
