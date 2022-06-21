package StringTest;

public class PatterMatch {

	  public static boolean regexMatch
      (String text, String pat)
{
int lenText = text.length();
int lenPat = pat.length();

char[] Text = text.toCharArray();
char[] Pat = pat.toCharArray();

// i is used as an index in pattern
// and j as an index in text.
int i = 0, j = 0;

// Traverse through pattern
while (i < lenPat)
{
// If current character of
// pattern is not '#'
if (Pat[i] != '#')
{
// If does not match with text.
if (Pat[i] != Text[j])
return false;

// If matches, increment i and j
i++;
j++;
}

// Current character is '#'
else
{
// At least one character
// must match with #
	
j++;
// Match characters with # until
// a matching character is found.
while (Text[j] != Pat[i + 1])
j++;

// Matching with # is over,
// move ahead in pattern
i++;
}
}

return (j == lenText);
}

// Driver code
public static void main (String[] args)
{
String str = "ABBBB";
String pat = "A#B";
if (regexMatch(str, pat))
System.out.println("yes");
else
System.out.println("no");
}

}
