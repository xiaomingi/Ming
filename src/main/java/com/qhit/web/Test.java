package com.qhit.web;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qhit.mapper.CommonBeanDao;
import com.qhit.mapper.TbOrdersdetailsDao;
import com.qhit.mapper.TbQingDao;
import com.qhit.pojo.CommonBean;
import com.qhit.pojo.LayuiResult;
import com.qhit.pojo.Ratiotable;
import com.qhit.pojo.TbQing;
import com.qhit.service.RatiotableService;
import com.qhit.service.TbQingService;
import com.qhit.util.System_StatusCode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class Test {
//    @Resource
//    RgManageDaoService rgManageDaoService;
    @Resource
    RatiotableService ratiotableService;
@Resource
TbQingService qingService;
@Resource
TbQingDao tbQingDao;

    @Resource
    CommonBeanDao beanDao;

    @Resource
    TbOrdersdetailsDao tbOrdersdetailsDao;
    @RequestMapping("/rgManage.html")
    public String aa() {

        return "rgManage";
    }
    @RequestMapping("/hello.html")
    public String aaa() {

        return "hello";
    }
    @RequestMapping("/fumian.html")
    public String f() {

        return "fumian";
    }
    @RequestMapping("/chayan.html")
    public String c() {

        return "chayan";
    }
    @RequestMapping("/Jingzhichujingc.html")
    public String jzcjc() {

        return "Jingzhichujingc";
    }


    @RequestMapping("/qingfanxin.html")
    public String q() {

        return "qingfanxin";
    }
    @RequestMapping("/jinzhichujin.html")
    public String j() {

        return "jinzhichujin";
    }
    @RequestMapping("/qingdan.html")
    public String qd() {

        return "qingdan";
    }
    @RequestMapping("/Singletrial.html")
    public String sl() {

        return "Singletrial";
    }
    @RequestMapping("/Jingzhichujingfc.html")
    public String jzcjfc() {

        return "Jingzhichujingfc";
    }
//    @RequestMapping("lista")
//    @ResponseBody
//    public LayuiResult<Regulation> ggg(int page,int limit){
//        PageHelper.startPage(page,limit);
//
//        LayuiResult<Regulation> result=new LayuiResult<>();
//        List<Regulation> list=regulationService.getRegulationList();
//        System.out.println(page+"   "+limit);
//        PageInfo<Regulation> pageInfo = new PageInfo<>(list);
//
//        result.setData(pageInfo.getList());
//        System.out.println(pageInfo);
//        result.setCount(21);
//        return result;
    //}
//@RequestMapping("aaa")
//@ResponseBody
//    public String qwe(){
//        List rgManages = rgManageDaoService.selectByStauts("7");
//        for (RgManage rgManage:
//                rgManages ) {
//            System.out.println(rgManage.getTbOrdersdetails().get(0).getGoodsName());
//            return rgManage.getTbOrdersdetails().get(0).getGoodsName();
//        }
//        return null;
//    }

    /*@RequestMapping("aaa")
    @ResponseBody
    public LayuiResult<Rgmanage> qwe(int page, int limit){
        PageHelper.startPage(page,limit);
        LayuiResult<Rgmanage> result=new LayuiResult<>();
        List<Rgmanage> rgmanages=new ArrayList<Rgmanage>();
        List<TbQing> tbQings = qingService.selectByStauts("1");

        for (TbQing tbQing: tbQings ) {

            TbOrdersdetailsExample tbOrdersdetailsExample =new TbOrdersdetailsExample();
            TbOrdersdetailsExample.Criteria criteria1 =tbOrdersdetailsExample.createCriteria();
            criteria1.andOrdersNoEqualTo(tbQing.getOrdersNo());
            List<TbOrdersdetails> ordersdetails = tbOrdersdetailsDao.selectByExample(tbOrdersdetailsExample);
            for (TbOrdersdetails tbOrdersdetails:ordersdetails ) {

                Rgmanage rgmanage =new Rgmanage();
                rgmanage.setOrdersNo(tbOrdersdetails.getOrdersNo());
                rgmanage.setStauts(tbQing.getStauts());
                rgmanage.setOrdersdetailsNo(tbOrdersdetails.getOrdersdetailsNo());
                rgmanage.setGoodsNo(tbOrdersdetails.getGoodsNo());
                rgmanage.setGoodsinsp(tbOrdersdetails.getGoodsinsp());
                rgmanage.setGoodsNumber(tbOrdersdetails.getGoodsNumber());
                rgmanage.setCreateTime(tbOrdersdetails.getCreateTime());
                rgmanage.setGoodsPrice(tbOrdersdetails.getGoodsPrice());
                rgmanage.setTotal(tbOrdersdetails.getGoodsPrice()*tbOrdersdetails.getGoodsNumber());
                rgmanages.add(rgmanage);

            }
            PageInfo<Rgmanage> pageInfo = new PageInfo<>(rgmanages);
           result.setData(pageInfo.getList());
            result.setCount(1000);
//0.00000005


        }

        return result;
    }*/
    @RequestMapping("aaaa")
    @ResponseBody
    public int aaaa(String ordersNo){
        System.out.println(ordersNo);
        int upz = tbQingDao.upz(System_StatusCode.permit_through, ordersNo);

        return upz;
    }
    @RequestMapping("qqq")
    @ResponseBody
    public int qqq(String ordersNo){
        System.out.println(ordersNo);
        int upz = tbQingDao.upz("3", ordersNo);

        return upz;
    }

   /* @RequestMapping("qwer")
    @ResponseBody
    public int qwer(String ordersNo){
        System.out.println(ordersNo);
        List<TbQing> tbQings = tbQingDao.servictTbQingAll();
         for (int i=0;i<tbQings.size();i++){
             System.out.println("getUserName:"+tbQings.get(i).getByTbOrders().get(0).getUserName());
             System.out.println("GoodsPrice:"+tbQings.get(i).getOrdersdetails().get(0).getGoodsPrice());
             System.out.println("Wlqycodeinsp:"+tbQings.get(i).getTbWaybills().get(0).getWlqycodeinsp());
             System.out.println("Cbename"+tbQings.get(i).getTbGoods().get(0).getCbename());
             System.out.println("Stauts"+tbQings.get(i).getStauts());




         }

        return 1;
    }*/

    @RequestMapping("aaa")
    @ResponseBody
    public LayuiResult<CommonBean> GuoJianAll(int page, int limit){
        PageHelper.startPage(page,limit);
        LayuiResult<CommonBean> result=new LayuiResult<>();
        List<CommonBean> tbQings =beanDao.commonBeanAll(System_StatusCode.artificial);
        PageInfo<CommonBean> pageInfo =new PageInfo<>(tbQings);
        result.setData(pageInfo.getList());

        //result.setCount(1000);
        return result;
    }

    @RequestMapping("fumian")
    @ResponseBody
    public LayuiResult<CommonBean> FuMianAll(int page, int limit){
        PageHelper.startPage(page,limit);
        LayuiResult<CommonBean> result=new LayuiResult<>();
        List<CommonBean> tbQings =beanDao.commonBeanAll(System_StatusCode.negative);
        PageInfo<CommonBean> pageInfo =new PageInfo<>(tbQings);
        result.setData(pageInfo.getList());

        //result.setCount(1000);
        return result;
    }

    @RequestMapping("Jingzhichujingc")
    @ResponseBody
    public LayuiResult<CommonBean> JingzhichujingcAll(int page, int limit){
        PageHelper.startPage(page,limit);
        LayuiResult<CommonBean> result=new LayuiResult<>();
        List<CommonBean> tbQings =beanDao.commonBeanAll(System_StatusCode.Banned_from_C);
        PageInfo<CommonBean> pageInfo =new PageInfo<>(tbQings);
        result.setData(pageInfo.getList());

        //result.setCount(1000);
        return result;
    }
    @RequestMapping("Jingzhichujingfc")
    @ResponseBody
    public LayuiResult<CommonBean> JingzhichujingccfAll(int page, int limit){
        PageHelper.startPage(page,limit);
        LayuiResult<CommonBean> result=new LayuiResult<>();
        List<CommonBean> tbQings =beanDao.commonBeanAll(System_StatusCode.Banned_from_F);
        PageInfo<CommonBean> pageInfo =new PageInfo<>(tbQings);
        result.setData(pageInfo.getList());

        //result.setCount(1000);
        return result;
    }

    @RequestMapping("chayan")
    @ResponseBody
    public LayuiResult<CommonBean> ChaYanAll(int page, int limit){
        PageHelper.startPage(page,limit);
        LayuiResult<CommonBean> result=new LayuiResult<>();
        List<CommonBean> tbQings =beanDao.commonBeanAll(System_StatusCode.check);
        PageInfo<CommonBean> pageInfo =new PageInfo<>(tbQings);
        result.setData(pageInfo.getList());

        //result.setCount(1000);
        return result;
    }
    @RequestMapping("jinzhichujin")
    @ResponseBody
    public LayuiResult<CommonBean> JinZhiChuJinYanAll(int page, int limit){
        PageHelper.startPage(page,limit);
        LayuiResult<CommonBean> result=new LayuiResult<>();
        List<CommonBean> tbQings =beanDao.commonBeanAll(System_StatusCode.Banned_from);
        PageInfo<CommonBean> pageInfo =new PageInfo<>(tbQings);
        result.setData(pageInfo.getList());

        //result.setCount(1000);
        return result;
    }
    @RequestMapping("qingfanxin")
    @ResponseBody
    public LayuiResult<CommonBean> qingfanxinAll(int page, int limit){
        PageHelper.startPage(page,limit);
        LayuiResult<CommonBean> result=new LayuiResult<>();
        List<CommonBean> tbQings =beanDao.commonBeanAll(System_StatusCode.permit_through);
        PageInfo<CommonBean> pageInfo =new PageInfo<>(tbQings);
        result.setData(pageInfo.getList());

        //result.setCount(1000);
        return result;
    }
    @RequestMapping("qingdan")
    @ResponseBody
    public LayuiResult<TbQing> QingDanAll(int page, int limit){


            PageHelper.startPage(page,limit);
            LayuiResult<TbQing> result=new LayuiResult<>();

            List<TbQing> tbQings = tbQingDao.selectByExample(null);
            PageInfo<TbQing> pageInfo =new PageInfo<>(tbQings);
            result.setData(pageInfo.getList());

                result.setCount(1000);
        return result;
    }
    @RequestMapping("Singletrial")
    @ResponseBody
    public LayuiResult<Ratiotable> SingletrialAll(int page, int limit){
        PageHelper.startPage(page,limit);
        LayuiResult<Ratiotable> result=new LayuiResult<>();
        List<Ratiotable> ratiotables =ratiotableService.RatiotableAll();
        PageInfo<Ratiotable> pageInfo =new PageInfo<>(ratiotables);
        result.setData(pageInfo.getList());

            return result;
    }
    @RequestMapping("chayanaa")
    @ResponseBody
    public int chayanaa(String ordersNo){
        System.out.println(ordersNo);
        int upz = tbQingDao.upz(System_StatusCode.Banned_from_C, ordersNo);

        return upz;
    }

    /**
     * 禁止出境初审
     * @param ordersNo
     * @return
     */
    @RequestMapping("JinzhiChu")
    @ResponseBody
    public int JinzhiChuJingC(String ordersNo){
        System.out.println(ordersNo+"JinzhiChuc");
        int upz = tbQingDao.upz(System_StatusCode.Banned_from_C, ordersNo);

        return upz;
    }/**
     * 禁止出境复审
     * @param ordersNo
     * @return
     */
    @RequestMapping("JinzhiChujinfc")
    @ResponseBody
    public int JinzhiChujinfc(String ordersNo){
        System.out.println(ordersNo+"JinzhiChu复审");
        int upz = tbQingDao.upz(System_StatusCode.Banned_from_F, ordersNo);

        return upz;
    }




    /**
     * 禁止出境
     * @param ordersNo
     * @return
     */
    @RequestMapping("JinzhiChujin")
    @ResponseBody
    public int JinzhiChuJing(String ordersNo){
        System.out.println(ordersNo+"JinzhiChu");
        int upz = tbQingDao.upz(System_StatusCode.Banned_from, ordersNo);

        return upz;
    }

}
