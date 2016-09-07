package edu.gatech.seclass;

public class MyCustomString implements MyCustomStringInterface{

	private String stringVariable;
	@Override
	public String getString() {
		// TODO Auto-generated method stub
		return stringVariable;
	}

	@Override
	public void setString(String string) {
		stringVariable=string;
		
	}

	@Override
	public int countNumbers() {
		String tempString=this.getString();
		int numberCount=0;
		boolean consecutiveNumber=false;
		StringBuilder tempsb= new StringBuilder();
		for(char a:tempString.toCharArray()){
			if(Character.isDigit(a)){
				if(consecutiveNumber==false){
					numberCount=numberCount+1;
					consecutiveNumber=true;
					
				}
				
				
			}else{
				consecutiveNumber=false;
			}
		}
		return numberCount;
	}

	@Override
	public String getEveryNthCharacterFromBeginningOrEnd(int n, boolean startFromEnd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void convertDigitsToNamesInSubstring(int startPosition, int endPosition) {
		// TODO Auto-generated method stub
		
	}
	
	
}