package hw8.family;

import hw8.family.People.Family;
import hw8.family.People.Human;
import hw8.family.People.Man;
import hw8.family.People.Woman;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FamilyDeleteChildTest {
    Family module;
    Human kid1, kid2,kid3,kid4,kid5,kid6;
    String[][] schedule = new String[7][2];

    @Before
    public void setUp() {
        schedule[0][0] = DayOfWeek.SUNDAY.name().toLowerCase();
        schedule[0][1] = "First day born";
        schedule[1][0] = DayOfWeek.MONDAY.name().toLowerCase();
        schedule[1][1] = "Second day born";
        module = new Family(new Woman("Mother", "Ryab", 1960),
                new Man("Father", "Ryab", 1960)
        );
        kid1 = new Man("Kid1", "Kidovich1", 2000,
                1, schedule, module);
        kid2 = new Man("Kid2", "Kidovich2", 2000,
                2, schedule, module);
        kid3 = new Man("Kid3", "Kidovich3", 2000,
                3, schedule, module);
        kid4 = new Woman("Kid4", "Kidovich4", 2000,
                4, schedule, module);
        kid5 = new Woman("Kid5", "Kidovich5", 2000,
                5, schedule, module);
        kid6 = new Woman("Kid6", "Kidovich6", 2000,
                6, schedule, module);
        module.setChildren(kid1);
        module.setChildren(kid2);
        module.setChildren(kid3);
        module.setChildren(kid4);
        module.setChildren(kid5);
        module.setChildren(kid6);
    }

    @Test
    public void testDeleteChildSuccess() {
//        System.out.println(Arrays.toString(module.getChildren()));
        boolean isDeleted = module.deleteChild(1);
        List<Human> freshChildren = module.getChildren();
        boolean remainedFirstElem = freshChildren.get(0).getName().equals("Kid1");
        boolean secondElemDeleted = !freshChildren.get(1).toString().equals("Kid2");
        boolean testResult = isDeleted && remainedFirstElem && secondElemDeleted;
//        System.out.println(Arrays.toString(module.getChildren()));
        assertTrue(testResult);
    }

    @Test
    public void testDeleteChildUnsuccess() {
        int arrInitLength = module.getChildren().size();
        module.deleteChild(56);
        module.deleteChild(-1);
        int arrFinalLength = module.getChildren().size();
        assertEquals(arrInitLength, arrFinalLength);
    }

}
