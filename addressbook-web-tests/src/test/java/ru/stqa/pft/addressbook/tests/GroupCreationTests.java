package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;


public class GroupCreationTests extends TestBase{

    @Test
    public void testGroupCreation() {

        app.getNavigationHelper().gotoGroupPage();
       // тут сравниваем размеры списков, которые получены с при помощи getGroupList (а следующем модуле будет сравнение списков целиком)
        List<GroupData> before = app.getGroupHelper().getGroupList();
        app.getGroupHelper().createGroup( new GroupData("test1", null, null) );
        List<GroupData> after = app.getGroupHelper().getGroupList();
        Assert.assertEquals(after.size(), before.size()+1 );
    }

}
