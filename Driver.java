
Conversation opened. 2 messages. 2 messages unread.

Skip to content
Using Stuyvesant Mail with screen readers

30 of 4,247
Helpful Driver for the USACO problems
Inbox
x

Bryant Stringham <bstringham@stuy.edu>
Attachments
Mar 6, 2019, 9:44 PM (4 days ago)
to APCS2018-Konstantinovich

I haven't been here for the past couple of days, so I don't know if we are allowed to receive help for this. If not, please tell me, and don't use the attachment. If we are allowed to help each other, I have attached a driver that tests all of the files in testCases automatically. At least, it did on my machine. Tell me if it isn't working on your respective devices.

P.S. Remember that for this to work, an unzipped version of testCases must be in your MKS22X-USACO directory.

Attachments area

Derek Lao <dlao00@stuy.edu>
Mar 8, 2019, 1:35 AM (2 days ago)
to APCS2018-Konstantinovich

Thank you for this, I just want to note that a more helpful set of instructions to print your answer vs the actual answer along with the boolean for whether you are correct or not:

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Tester {
    public static void main(String[] args) {
        try {
            System.out.println("Bronze:");
            for (int i = 1; i < 6; i++) {
                File correct = new File("testCases/makelake." + i + ".out");
                Scanner yes = new Scanner(correct);
                int yourAnswer = USACO.bronze("testCases/makelake." + i + ".in");
                int correctAnswer = yes.nextInt();
                System.out.println(i + " Yours: " + yourAnswer + " Key: " + correctAnswer + " " + (yourAnswer == correctAnswer));
                yes.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        try {
            //System.out.println(USACO.silver("testCases/ctravel.2.in"));
            System.out.println("Silver:");
            for (int i = 1; i < 6; i++) {
                File checkPlus = new File("testCases/ctravel." + i + ".out");
                Scanner A = new Scanner(checkPlus);
                int yourAnswer = USACO.silver("testCases/makelake." + i + ".in");
                int correctAnswer = A.nextInt();
                System.out.println(i + " Yours: " + yourAnswer + " Key: " + correctAnswer + " " + (yourAnswer == correctAnswer));
                A.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}


On Wednesday, March 6, 2019 at 9:44:26 PM UTC-5, Bryant Stringham wrote:
I haven't been here for the past couple of days, so I don't know if we are allowed to receive help for this. If not, please tell me, and don't use the attachment. If we are allowed to help each other, I have attached a driver that tests all of the files in testCases automatically. At least, it did on my machine. Tell me if it isn't working on your respective devices.

P.S. Remember that for this to work, an unzipped version of testCases must be in your MKS22X-USACO directory.
--
You received this message because you are subscribed to the Google Groups "APCS2018-Konstantinovich" group.
To unsubscribe from this group and stop receiving emails from it, send an email to apcs2018-konstantinovich+unsubscribe@stuy.edu.
To post to this group, send email to apcs2018-konstantinovich@stuy.edu.
Visit this group at https://groups.google.com/a/stuy.edu/group/apcs2018-konstantinovich/.
To view this discussion on the web visit https://groups.google.com/a/stuy.edu/d/msgid/apcs2018-konstantinovich/a54f481c-377b-493c-a0bf-4e55c500788d%40stuy.edu.


import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Tester {
    public static void main(String[] args) {
        try {
            System.out.println("Bronze:");
            for (int i = 1; i < 6; i++) {
                File correct = new File("testCases/makelake." + i + ".out");
                Scanner yes = new Scanner(correct);
                System.out.println(i + " " + (USACO.bronze("testCases/makelake." + i + ".in") == yes.nextInt()));
                yes.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        try {
            //System.out.println(USACO.silver("testCases/ctravel.2.in"));
            System.out.println("Silver:");
            for (int i = 1; i < 6; i++) {
                File checkPlus = new File("testCases/ctravel." + i + ".out");
                Scanner A = new Scanner(checkPlus);
                System.out.println(i + " " + (USACO.silver("testCases/ctravel." + i + ".in") == A.nextInt()));
                A.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
