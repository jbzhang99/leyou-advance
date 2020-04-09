package com.leyou.common.constant;

/**
 * @author 黑马程序员
 */
public abstract class MQConstants {

    public static final class Exchange {
        /**
         * 商品服务交换机名称
         */
        public static final String ITEM_EXCHANGE_NAME = "ly.item.exchange";
        /**
         * 消息服务交换机名称
         */
        public static final String SMS_EXCHANGE_NAME = "ly.sms.exchange";
        /**
         * 抢购商品服务交换机名称
         */
        public static final String PROMOTION_EXCHANGE_NAME = "ly.promotion.exchange";
        /**
         * 商品分类交换机名称
         */
        public static final String CATEGORY_EXCHANGE_NAME = "ly.category.exchange";

    }



    public static final class RoutingKey {
        /**
         * 商品上架的routing-key
         */
        public static final String ITEM_UP_KEY = "item.up";
        /**
         * 商品下架的routing-key
         */
        public static final String ITEM_DOWN_KEY = "item.down";
        /**
         * 消息服务的routing-key
         */
        public static final String VERIFY_CODE_KEY = "sms.verify.code";
        /**
         * 抢购商品的routing-key
         */
        public static final String PROMOTION_KEY = "promotion.key";
        /**
         * 商品分类修改的routing-key
         */
        public static final String CATEGORY_UPDATE_KEY = "category.update";

    }

    public static final class Queue{
        /**
         * 搜索服务，商品上架的队列
         */
        public static final String SEARCH_ITEM_UP = "search.item.up.queue";
        /**
         * 搜索服务，商品下架的队列
         */
        public static final String SEARCH_ITEM_DOWN = "search.item.down.queue";

        /**
         * 搜索服务，商品上架的队列
         */
        public static final String PAGE_ITEM_UP = "page.item.up.queue";
        /**
         * 搜索服务，商品下架的队列
         */
        public static final String PAGE_ITEM_DOWN = "page.item.down.queue";
        /**
         * 消息服务的队列
         */
        public static final String SMS_VERIFY_CODE_QUEUE = "sms.verify.code.queue";
        /**
         * 抢购商品的队列
         */
        public static final String PROMOTION_ORDER_QUEUE = "promotion.order.queue";
        /**
         * 商品分类修改的队列
         */
        public static final String CATEGORY_UPDATE = "category.update.queue";
    }
}