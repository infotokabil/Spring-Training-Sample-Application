package InnerClassBean;
public class TextEditor {
	   public static SpellChecker spellChecker;
	   public TextEditor(){
		
		      System.out.println("TextEditor constructor." );
		   }
	   // a setter method to inject the dependency.
	   public void setSpellChecker(SpellChecker spellChecker) {
	      System.out.println("Inside setSpellChecker." );
	      this.spellChecker = spellChecker;
	      System.out.println(spellChecker.hashCode());
	   }
	   
	   // a getter method to return spellChecker
	   public SpellChecker getSpellChecker() {
	      return spellChecker;
	   }
	   public void spellCheck() {
		 System.out.println(spellChecker.hashCode());  
	      spellChecker.checkSpelling();
	   }
	}