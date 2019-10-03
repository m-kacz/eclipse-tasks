class StringProcessing {
    public void PrintVertical(String msg) {
        int i= 0;
        for(i = 0; i<msg.length(); i++) {
            System.out.println(msg.substring(i, i+1));
        }
    }
    
    public void WordCount(String msg) {
        int spacecount = 0;
        int i = 0;
        String alpha;
        for(i = 0; i<msg.length(); i++) {
            alpha = msg.substring(i, i+1);
            if(alpha.equals(" ")) {
                spacecount ++;
            }
        }
        System.out.println("We have " + (spacecount + 1) + " words");
    }


	public void PrintVertical2(String msg) {
		String word = " ", alpha;
		int i = 0;
		for(;i<msg.length();i++) {
			alpha = msg.substring(i, i+1);
			if(alpha.equals(" ")) {
				System.out.println(word);
				word = " ";
			}
			else {
				word+=alpha;
			}
		}
		System.out.println(word);
	}

	public void VerticalReverse(String msg) {
		String word = " ", alpha;
		int i = msg.length()-1;
		for(;i>=0;i--) {
			alpha = msg.substring(i, i+1);
			if(alpha.equals(" ")) {
				System.out.println(word);
				word = " ";
			}
			else {
				word=alpha+word;
			}
		}
		System.out.println(word);
	}
	
	public void Find(String msg, String lookfor) {
		int count = 0;
		int i = 0;
		String alpha;
		for(i = 0; i < msg.length(); i++) {
			alpha = msg.substring(i, i+1);
			if(alpha.contentEquals(lookfor.substring(0,1))) {
				if(msg.substring(i, i+lookfor.length()).equals(lookfor)) {
					count++;
					i += lookfor.length() - 1;
				}
			}
		}
		System.out.println(count+" matching results for "+lookfor);	
	}
}
