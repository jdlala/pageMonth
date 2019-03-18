import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Page {
    public void getPage(List tmpList , int page, int pageSize){
        List<Map<String,Object>> resultList = new ArrayList<>();
        //tmpSize循环次数,pageNum需要分多少页,totalCount数组总条数,tmpIndex从第几个开始循环
        int tmpSize = 0,pageNum = 0,totalCount = tmpList.size(),tmpIndex=(page-1)*10;
        //总条数除以条数，有没有余数，有余数分页数加1
        pageNum = totalCount%pageSize == 0 ? totalCount/pageSize : totalCount/pageSize + 1;
        tmpSize = page < pageNum ? tmpIndex + pageSize : totalCount;
        for (int i=tmpIndex;i<tmpSize;i++){
            resultList.add(tmpList.get(i));
        }
    }
}
