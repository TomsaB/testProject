package oana;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.*;
import org.apache.commons.collections.CollectionUtils;

public class Example {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        if (CollectionUtils.isEmpty(list)) System.out.println("da");
    }
}
