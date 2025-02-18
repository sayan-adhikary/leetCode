class Solution {
    public String smallestNumber(String s) {
        char ch [] = new char[s.length()+1];
		for(int val = 1; val <= 9; val++)
		{
			ch[0] = (char)(val + '0');
			if(check(s, ch, 1))
			{
				return String.valueOf(ch);
			}
		}				
        return "";
	}

	private static boolean check(String s, char[] ch, int ind) {
			if(ind >= ch.length)
			{
				return true;
			}
		
			if(s.charAt(ind-1) == 'I')
			{
				for(int num = 1; num < 10; num++)
				{
					if(isSafe(ch, num))
					{
						ch[ind] = (char)(num +'0');
						if(ch[ind-1] < ch[ind])
						{
							if(check(s, ch, ind + 1))
							{
								return true;
							}
						}
						else
						{
							ch[ind] = ' ';
						}
					}
				}
				return false;
			}
			else 
			{
				for(int num = 1; num < 10; num++)
				{
					if(isSafe(ch, num))
					{
						ch[ind] = (char)(num +'0');
						if(ch[ind - 1] > ch[ind])
						{
							if(check(s, ch , ind + 1))
							{
								return true;
							}
						}
						else
						{
							ch[ind] = ' ';
						}
					}
				}
				return false;
			}
	}

	private static boolean isSafe(char[] ch, int num) {
		
		for(int i = 0;i < ch.length; i++)
		{
			if(ch[i]-'0' == num)
			{
				return false;
			}
		}
		return true;
	}
}