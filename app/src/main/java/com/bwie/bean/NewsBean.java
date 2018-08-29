package com.bwie.bean;

import java.util.List;

/**
 * 网络的bean包
 * Created by wang on 2018/8/25.
 */

public class NewsBean {

    /**
     * error_code : 0
     * reason : 成功的返回
     * result : {"data":[{"author_name":"参考消息网","category":"头条","date":"2018-08-07 15:47","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20180807/20180807154718_d26151b10fc104fc51dcaf46aaef539a_1_mwpm_03200403.jpg","title":"美媒：高温导致全球小麦价格飙升 面包或将更贵","type":"a","uniquekey":"92c9133916a15803a87b6517a7933598","url":"http://mini.eastday.com/mobile/180807154718185.html"},{"type":"b","author_name":"汽车加油站","category":"头条","date":"2018-08-07 15:44","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20180807/20180807154459_88f8446a93c9389b3d32ec3628d32bc5_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20180807/20180807154459_88f8446a93c9389b3d32ec3628d32bc5_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20180807/20180807154459_88f8446a93c9389b3d32ec3628d32bc5_3_mwpm_03200403.jpg","title":"江疏影座驾竟然这么豪华，内饰真温馨！","uniquekey":"40b236cc3cf3f3f9884a5eb9734f9a2a","url":"http://mini.eastday.com/mobile/180807154459047.html"},{"type":"b","author_name":"开封市第二十五中学","category":"头条","date":"2018-08-07 15:43","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20180807/20180807154329_0c22973c751e6ad07388e902a6f275b8_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20180807/20180807154329_0c22973c751e6ad07388e902a6f275b8_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20180807/20180807154329_0c22973c751e6ad07388e902a6f275b8_3_mwpm_03200403.jpg","title":"开封市二十五中田径项目取得历史性突破","uniquekey":"e2b102c07511c442eed2b368e37a3d0c","url":"http://mini.eastday.com/mobile/180807154329684.html"},{"type":"a","author_name":"中国新闻网","category":"头条","date":"2018-08-07 15:40","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20180807/20180807154013_3a9c56d8394f002a0431d1a42d77e09d_1_mwpm_03200403.jpg","title":"香港警方捣毁一伪钞制作工场 查获面值140万伪钞","uniquekey":"b67e6130e5ee8e64e9c5154ebf326c23","url":"http://mini.eastday.com/mobile/180807154013208.html"},{"type":"b","author_name":"广西新闻网","category":"头条","date":"2018-08-07 15:37","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20180807/20180807153712_c80777785b9effaed05c9d93588e6270_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20180807/20180807153712_2af9a936efcfc2a6612103a789cad7ce_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20180807/20180807153712_dac12088f88e92b36f299b210eaf3074_1_mwpm_03200403.jpg","title":"围甲联赛：国旅联合厦门队胜天津四建队","uniquekey":"67e96b2bd42e68f0507e1c4cf9064746","url":"http://mini.eastday.com/mobile/180807153712686.html"},{"type":"b","author_name":"环球网","category":"头条","date":"2018-08-07 15:35","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20180807/20180807153526_83cccf49edb38b97b755f373398d80f9_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20180807/20180807153526_83cccf49edb38b97b755f373398d80f9_9_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20180807/20180807153526_83cccf49edb38b97b755f373398d80f9_2_mwpm_03200403.jpg","title":"蔡英文当初竞选公仔产地被扒大陆造！网友笑翻：这是大陆卧底吗？","uniquekey":"7d1e48b988ed2d86d8a56314feef4251","url":"http://mini.eastday.com/mobile/180807153526157.html"},{"type":"b","author_name":"媛媛姐姐","category":"头条","date":"2018-08-07 15:32","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20180807/20180807153252_aeb9da150da928f2db6d99622c0a574d_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20180807/20180807153252_aeb9da150da928f2db6d99622c0a574d_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20180807/20180807153252_aeb9da150da928f2db6d99622c0a574d_2_mwpm_03200403.jpg","title":"女子偶遇一辆保时捷出租车，称：以为自己在迪拜","uniquekey":"7d483fe781cc3152cc7b030170ffb5d4","url":"http://mini.eastday.com/mobile/180807153252085.html"},{"type":"b","author_name":"东方头条","category":"头条","date":"2018-08-07 15:29","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20180807/20180807_33b8169be6c203ea1173fa8490e6094a_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20180807/20180807_cf2be1995e02bd105e13461b80425e9b_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20180807/20180807_3709a1f084ebaf3f6f740c646e4c59d3_cover_mwpm_03200403.jpg","title":"躺棺材睡觉能转运？女子迷信神秘仪式，把自己活活\u201c作\u201d死了","uniquekey":"544ef4f5f918c10ec7fd3f354213f8e6","url":"http://mini.eastday.com/mobile/180807152923781.html"},{"type":"a","author_name":"中国台湾网","category":"头条","date":"2018-08-07 15:26","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20180807/20180807152627_cdb8c7cc168f28cd3062c67efa287678_1_mwpm_03200403.jpg","title":"前台南县长苏焕智：民进党再继续搞 台湾必死路一条","uniquekey":"c1bcbe8e50271afd50d288a17f4eda23","url":"http://mini.eastday.com/mobile/180807152627999.html"},{"type":"b","author_name":"小郝话历史","category":"头条","date":"2018-08-07 15:20","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20180807/20180807152058_81e37ff608bea88816ded9cb361af39e_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20180807/20180807152058_81e37ff608bea88816ded9cb361af39e_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20180807/20180807152058_81e37ff608bea88816ded9cb361af39e_3_mwpm_03200403.jpg","title":"二战美女飞行员，单枪匹马营救希特勒，战后却受到肯尼迪接见！","uniquekey":"fe316915d529a22293412a6622a8cd61","url":"http://mini.eastday.com/mobile/180807152058684.html"},{"type":"b","author_name":"北青网","category":"头条","date":"2018-08-07 15:20","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20180807/20180807152048_8edcd1017711762442b79e9d37fa6f5a_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20180807/20180807152048_8edcd1017711762442b79e9d37fa6f5a_6_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20180807/20180807152048_8edcd1017711762442b79e9d37fa6f5a_5_mwpm_03200403.jpg","title":"那些曾经被玩坏了的表情包的主人公，如今变成这个样子","uniquekey":"8173d44b79012c961a76e370fbedd85d","url":"http://mini.eastday.com/mobile/180807152048780.html"},{"type":"b","author_name":"北青网","category":"头条","date":"2018-08-07 15:20","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20180807/20180807152048_1e5716293c2f9fcae593d5749c57e43f_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20180807/20180807152048_1e5716293c2f9fcae593d5749c57e43f_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20180807/20180807152048_1e5716293c2f9fcae593d5749c57e43f_1_mwpm_03200403.jpg","title":"\u201c三伏\u201d期间做好这4件事，让你在不知不觉重变瘦！","uniquekey":"9c6389a13c901746983e73405dc762b0","url":"http://mini.eastday.com/mobile/180807152048461.html"},{"type":"b","author_name":"北青网","category":"头条","date":"2018-08-07 15:20","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20180807/20180807152047_a5f67eb564ad8b9e3dce0b652edd39bd_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20180807/20180807152047_a5f67eb564ad8b9e3dce0b652edd39bd_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20180807/20180807152047_a5f67eb564ad8b9e3dce0b652edd39bd_1_mwpm_03200403.jpg","title":"亚洲最大贫民窟：1500人共用一个厕所，人均月收入才60元","uniquekey":"a1507831c24803d079ba6d4edec2d0c6","url":"http://mini.eastday.com/mobile/180807152047101.html"},{"type":"b","author_name":"何有强","category":"头条","date":"2018-08-07 15:16","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20180807/20180807151647_0af6c9ae2bb23a738d340003937a97f3_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20180807/20180807151647_0af6c9ae2bb23a738d340003937a97f3_7_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20180807/20180807151647_0af6c9ae2bb23a738d340003937a97f3_2_mwpm_03200403.jpg","title":"章子怡和刘亦菲刘海发型秒变成大妈，舒畅周冬雨剪短发秒变成仙女","uniquekey":"acc669cfbd698f8010c69dc8032c6049","url":"http://mini.eastday.com/mobile/180807151647075.html"},{"type":"a","author_name":"环球网","category":"头条","date":"2018-08-07 15:15","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20180807/20180807151512_512ce528ca139642c7090eee2dbe70ff_1_mwpm_03200403.jpg","title":"王裕庆：台当局大搞\u201c正名\u201d 被国际奥委会踢出的可能性增加","uniquekey":"7f4774ad0846dcbd0e9e1c15f3018435","url":"http://mini.eastday.com/mobile/180807151512261.html"}],"stat":"1"}
     */

    private int error_code;
    private String reason;
    private ResultBean result;

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * data : [{"author_name":"参考消息网","category":"头条","date":"2018-08-07 15:47","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20180807/20180807154718_d26151b10fc104fc51dcaf46aaef539a_1_mwpm_03200403.jpg","title":"美媒：高温导致全球小麦价格飙升 面包或将更贵","type":"a","uniquekey":"92c9133916a15803a87b6517a7933598","url":"http://mini.eastday.com/mobile/180807154718185.html"},{"type":"b","author_name":"汽车加油站","category":"头条","date":"2018-08-07 15:44","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20180807/20180807154459_88f8446a93c9389b3d32ec3628d32bc5_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20180807/20180807154459_88f8446a93c9389b3d32ec3628d32bc5_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20180807/20180807154459_88f8446a93c9389b3d32ec3628d32bc5_3_mwpm_03200403.jpg","title":"江疏影座驾竟然这么豪华，内饰真温馨！","uniquekey":"40b236cc3cf3f3f9884a5eb9734f9a2a","url":"http://mini.eastday.com/mobile/180807154459047.html"},{"type":"b","author_name":"开封市第二十五中学","category":"头条","date":"2018-08-07 15:43","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20180807/20180807154329_0c22973c751e6ad07388e902a6f275b8_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20180807/20180807154329_0c22973c751e6ad07388e902a6f275b8_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20180807/20180807154329_0c22973c751e6ad07388e902a6f275b8_3_mwpm_03200403.jpg","title":"开封市二十五中田径项目取得历史性突破","uniquekey":"e2b102c07511c442eed2b368e37a3d0c","url":"http://mini.eastday.com/mobile/180807154329684.html"},{"type":"a","author_name":"中国新闻网","category":"头条","date":"2018-08-07 15:40","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20180807/20180807154013_3a9c56d8394f002a0431d1a42d77e09d_1_mwpm_03200403.jpg","title":"香港警方捣毁一伪钞制作工场 查获面值140万伪钞","uniquekey":"b67e6130e5ee8e64e9c5154ebf326c23","url":"http://mini.eastday.com/mobile/180807154013208.html"},{"type":"b","author_name":"广西新闻网","category":"头条","date":"2018-08-07 15:37","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20180807/20180807153712_c80777785b9effaed05c9d93588e6270_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20180807/20180807153712_2af9a936efcfc2a6612103a789cad7ce_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20180807/20180807153712_dac12088f88e92b36f299b210eaf3074_1_mwpm_03200403.jpg","title":"围甲联赛：国旅联合厦门队胜天津四建队","uniquekey":"67e96b2bd42e68f0507e1c4cf9064746","url":"http://mini.eastday.com/mobile/180807153712686.html"},{"type":"b","author_name":"环球网","category":"头条","date":"2018-08-07 15:35","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20180807/20180807153526_83cccf49edb38b97b755f373398d80f9_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20180807/20180807153526_83cccf49edb38b97b755f373398d80f9_9_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20180807/20180807153526_83cccf49edb38b97b755f373398d80f9_2_mwpm_03200403.jpg","title":"蔡英文当初竞选公仔产地被扒大陆造！网友笑翻：这是大陆卧底吗？","uniquekey":"7d1e48b988ed2d86d8a56314feef4251","url":"http://mini.eastday.com/mobile/180807153526157.html"},{"type":"b","author_name":"媛媛姐姐","category":"头条","date":"2018-08-07 15:32","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20180807/20180807153252_aeb9da150da928f2db6d99622c0a574d_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20180807/20180807153252_aeb9da150da928f2db6d99622c0a574d_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20180807/20180807153252_aeb9da150da928f2db6d99622c0a574d_2_mwpm_03200403.jpg","title":"女子偶遇一辆保时捷出租车，称：以为自己在迪拜","uniquekey":"7d483fe781cc3152cc7b030170ffb5d4","url":"http://mini.eastday.com/mobile/180807153252085.html"},{"type":"b","author_name":"东方头条","category":"头条","date":"2018-08-07 15:29","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20180807/20180807_33b8169be6c203ea1173fa8490e6094a_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20180807/20180807_cf2be1995e02bd105e13461b80425e9b_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20180807/20180807_3709a1f084ebaf3f6f740c646e4c59d3_cover_mwpm_03200403.jpg","title":"躺棺材睡觉能转运？女子迷信神秘仪式，把自己活活\u201c作\u201d死了","uniquekey":"544ef4f5f918c10ec7fd3f354213f8e6","url":"http://mini.eastday.com/mobile/180807152923781.html"},{"type":"a","author_name":"中国台湾网","category":"头条","date":"2018-08-07 15:26","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20180807/20180807152627_cdb8c7cc168f28cd3062c67efa287678_1_mwpm_03200403.jpg","title":"前台南县长苏焕智：民进党再继续搞 台湾必死路一条","uniquekey":"c1bcbe8e50271afd50d288a17f4eda23","url":"http://mini.eastday.com/mobile/180807152627999.html"},{"type":"b","author_name":"小郝话历史","category":"头条","date":"2018-08-07 15:20","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20180807/20180807152058_81e37ff608bea88816ded9cb361af39e_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20180807/20180807152058_81e37ff608bea88816ded9cb361af39e_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20180807/20180807152058_81e37ff608bea88816ded9cb361af39e_3_mwpm_03200403.jpg","title":"二战美女飞行员，单枪匹马营救希特勒，战后却受到肯尼迪接见！","uniquekey":"fe316915d529a22293412a6622a8cd61","url":"http://mini.eastday.com/mobile/180807152058684.html"},{"type":"b","author_name":"北青网","category":"头条","date":"2018-08-07 15:20","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20180807/20180807152048_8edcd1017711762442b79e9d37fa6f5a_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20180807/20180807152048_8edcd1017711762442b79e9d37fa6f5a_6_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20180807/20180807152048_8edcd1017711762442b79e9d37fa6f5a_5_mwpm_03200403.jpg","title":"那些曾经被玩坏了的表情包的主人公，如今变成这个样子","uniquekey":"8173d44b79012c961a76e370fbedd85d","url":"http://mini.eastday.com/mobile/180807152048780.html"},{"type":"b","author_name":"北青网","category":"头条","date":"2018-08-07 15:20","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20180807/20180807152048_1e5716293c2f9fcae593d5749c57e43f_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20180807/20180807152048_1e5716293c2f9fcae593d5749c57e43f_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20180807/20180807152048_1e5716293c2f9fcae593d5749c57e43f_1_mwpm_03200403.jpg","title":"\u201c三伏\u201d期间做好这4件事，让你在不知不觉重变瘦！","uniquekey":"9c6389a13c901746983e73405dc762b0","url":"http://mini.eastday.com/mobile/180807152048461.html"},{"type":"b","author_name":"北青网","category":"头条","date":"2018-08-07 15:20","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20180807/20180807152047_a5f67eb564ad8b9e3dce0b652edd39bd_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20180807/20180807152047_a5f67eb564ad8b9e3dce0b652edd39bd_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20180807/20180807152047_a5f67eb564ad8b9e3dce0b652edd39bd_1_mwpm_03200403.jpg","title":"亚洲最大贫民窟：1500人共用一个厕所，人均月收入才60元","uniquekey":"a1507831c24803d079ba6d4edec2d0c6","url":"http://mini.eastday.com/mobile/180807152047101.html"},{"type":"b","author_name":"何有强","category":"头条","date":"2018-08-07 15:16","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20180807/20180807151647_0af6c9ae2bb23a738d340003937a97f3_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20180807/20180807151647_0af6c9ae2bb23a738d340003937a97f3_7_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20180807/20180807151647_0af6c9ae2bb23a738d340003937a97f3_2_mwpm_03200403.jpg","title":"章子怡和刘亦菲刘海发型秒变成大妈，舒畅周冬雨剪短发秒变成仙女","uniquekey":"acc669cfbd698f8010c69dc8032c6049","url":"http://mini.eastday.com/mobile/180807151647075.html"},{"type":"a","author_name":"环球网","category":"头条","date":"2018-08-07 15:15","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20180807/20180807151512_512ce528ca139642c7090eee2dbe70ff_1_mwpm_03200403.jpg","title":"王裕庆：台当局大搞\u201c正名\u201d 被国际奥委会踢出的可能性增加","uniquekey":"7f4774ad0846dcbd0e9e1c15f3018435","url":"http://mini.eastday.com/mobile/180807151512261.html"}]
         * stat : 1
         */

        private String stat;
        private List <DataBean> data;

        public String getStat() {
            return stat;
        }

        public void setStat(String stat) {
            this.stat = stat;
        }

        public List <DataBean> getData() {
            return data;
        }

        public void setData(List <DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * author_name : 参考消息网
             * category : 头条
             * date : 2018-08-07 15:47
             * thumbnail_pic_s : http://03.imgmini.eastday.com/mobile/20180807/20180807154718_d26151b10fc104fc51dcaf46aaef539a_1_mwpm_03200403.jpg
             * title : 美媒：高温导致全球小麦价格飙升 面包或将更贵
             * type : a
             * uniquekey : 92c9133916a15803a87b6517a7933598
             * url : http://mini.eastday.com/mobile/180807154718185.html
             * thumbnail_pic_s02 : http://06.imgmini.eastday.com/mobile/20180807/20180807154459_88f8446a93c9389b3d32ec3628d32bc5_4_mwpm_03200403.jpg
             * thumbnail_pic_s03 : http://06.imgmini.eastday.com/mobile/20180807/20180807154459_88f8446a93c9389b3d32ec3628d32bc5_3_mwpm_03200403.jpg
             */

            private String author_name;
            private String category;
            private String date;
            private String thumbnail_pic_s;
            private String title;
            private String type;
            private String uniquekey;
            private String url;
            private String thumbnail_pic_s02;
            private String thumbnail_pic_s03;

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getThumbnail_pic_s() {
                return thumbnail_pic_s;
            }

            public void setThumbnail_pic_s(String thumbnail_pic_s) {
                this.thumbnail_pic_s = thumbnail_pic_s;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getUniquekey() {
                return uniquekey;
            }

            public void setUniquekey(String uniquekey) {
                this.uniquekey = uniquekey;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getThumbnail_pic_s02() {
                return thumbnail_pic_s02;
            }

            public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
                this.thumbnail_pic_s02 = thumbnail_pic_s02;
            }

            public String getThumbnail_pic_s03() {
                return thumbnail_pic_s03;
            }

            public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
                this.thumbnail_pic_s03 = thumbnail_pic_s03;
            }
        }
    }
}
