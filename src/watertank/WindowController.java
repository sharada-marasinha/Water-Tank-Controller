
package watertank;

public class WindowController{
    WaterTankObserver [] observerArray;
    private int nextIndex;
    private int waterLevel;

    public WindowController() {
        observerArray = new WaterTankObserver[100];
    }
    public void addWaterLevelObserver(WaterTankObserver ob){
		observerArray[nextIndex++]=ob;
    }

    public void setWaterLevel(int waterLevel){
	if(this.waterLevel!=waterLevel){
		this.waterLevel=waterLevel;
		notifyObservers();
	} 
    }

    	public void notifyObservers(){
		for (int i = 0; i < nextIndex; i++){
			observerArray[i].update(waterLevel);
		}
    

}
}
