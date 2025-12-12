class OffLight implements Command{
    public Light light;
    public OffLight(Light light){
        this.light = light;
    }
    public void execute(){
        this.light.turnOffLight();
    }
}