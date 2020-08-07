import java.awt.*;

class CustomNumberPuzzleControl extends NumberPuzzleControl {
	public int getWidth() {
		return 200;
	}
	public int getHeight() {
		return 250;
	}
	public int getXPosition() {
		return 200;
	}
	public int getYPosition() {
		return 200;
	}
	public String getTitle(){
		return "Number Puzzle";
	}
	public int getShuffleButtonFontSize() {
		return 12;
	}
	public int getNumbersFontSize() {
		return 12;
	}
	public Color getEmptyButtonColor() {
		return Color.WHITE;
	}
	public String getWinnerMessage() {
		return "Congrats, you have won!";
	}

	// The following three methods have to be written by the participants...

	public int handleButtonClicked(NumberPuzzleGame game){
		int emptyCellId = game.getEmptyCellId();
		Button buttonClicked = game.getButtonClicked();
		Button[] buttons = game.getButtons();{
		if(buttonClicked.action(null, buttonClicked)) {
		if(emptyCellId<15) {
			
		swapButton(buttons[emptyCellId],buttonClicked);
		
		}}}
		return emptyCellId;

	}
	public int[] getRandomNumbersForGrid() {
		int arr[] = new int[15];
		int i=0;
		while(i<15){
		int a = getRandomNumber();
		if(a<=15) {
			for(int j=0;j<i;j++) {
				if(arr[j]!=a) {
					arr[i]=a;
					i++;
				}
			}
						
		}
		}
		return arr;
	}
	public boolean checkForWinner(Button[] buttons)
	{
		boolean winner = true;
		
		int []arr=getIntegerArrayOfButtonIds(buttons);
		int flag=0;
for(int i=0;i<15;i++) {
	if(arr[i]==i) {
		flag++;
	}
}
if(flag==15) {
		return winner;
	}
else {
	return false;
}
}}