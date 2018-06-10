package personRest.userServices;

import org.springframework.stereotype.Service;

@Service
public class uSService {

    public long add(long a, long b)
    {
        return a+b;
    }

    public long multiple(long number, long multiplier)
    {
        return number*multiplier;
    }

    public String connect (String a, String b)
    {
        return a + " " + b;
    }


    public int length(String a)
    {
        return a.length();
    }

}

