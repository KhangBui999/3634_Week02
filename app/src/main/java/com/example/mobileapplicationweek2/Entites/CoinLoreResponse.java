package com.example.mobileapplicationweek2.Entites;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CoinLoreResponse {

    @SerializedName("data")
    @Expose
    private List<Coin> data = null;
    @SerializedName("info")
    @Expose
    private Info info;

    public List<Coin> getData() {
        return data;
    }

    public void setData(List<Coin> data) {
        this.data = data;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    //Hardcoded json String
    public static String json = "{\n" +
            "  \"data\": [\n" +
            "    {\n" +
            "      \"id\": \"90\",\n" +
            "      \"symbol\": \"BTC\",\n" +
            "      \"name\": \"Bitcoin\",\n" +
            "      \"nameid\": \"bitcoin\",\n" +
            "      \"rank\": 1,\n" +
            "      \"price_usd\": \"6485.57\",\n" +
            "      \"percent_change_24h\": \"3.48\",\n" +
            "      \"percent_change_1h\": \"0.57\",\n" +
            "      \"percent_change_7d\": \"1.70\",\n" +
            "      \"price_btc\": \"1.00\",\n" +
            "      \"market_cap_usd\": \"118563654719.79\",\n" +
            "      \"volume24\": 27611916283.494175,\n" +
            "      \"volume24a\": 25205582204.40905,\n" +
            "      \"csupply\": \"18281159.00\",\n" +
            "      \"tsupply\": \"18281159\",\n" +
            "      \"msupply\": \"21000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"80\",\n" +
            "      \"symbol\": \"ETH\",\n" +
            "      \"name\": \"Ethereum\",\n" +
            "      \"nameid\": \"ethereum\",\n" +
            "      \"rank\": 2,\n" +
            "      \"price_usd\": \"132.95\",\n" +
            "      \"percent_change_24h\": \"1.57\",\n" +
            "      \"percent_change_1h\": \"0.82\",\n" +
            "      \"percent_change_7d\": \"0.93\",\n" +
            "      \"price_btc\": \"0.020486\",\n" +
            "      \"market_cap_usd\": \"14651060581.09\",\n" +
            "      \"volume24\": 9495089058.269789,\n" +
            "      \"volume24a\": 8974526380.256277,\n" +
            "      \"csupply\": \"110196485.00\",\n" +
            "      \"tsupply\": \"110196485\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"58\",\n" +
            "      \"symbol\": \"XRP\",\n" +
            "      \"name\": \"XRP\",\n" +
            "      \"nameid\": \"ripple\",\n" +
            "      \"rank\": 3,\n" +
            "      \"price_usd\": \"0.173088\",\n" +
            "      \"percent_change_24h\": \"0.34\",\n" +
            "      \"percent_change_1h\": \"0.29\",\n" +
            "      \"percent_change_7d\": \"9.77\",\n" +
            "      \"price_btc\": \"0.000027\",\n" +
            "      \"market_cap_usd\": \"7427134029.04\",\n" +
            "      \"volume24\": 1507769183.5996797,\n" +
            "      \"volume24a\": 1691170195.5923834,\n" +
            "      \"csupply\": \"42909539227.00\",\n" +
            "      \"tsupply\": \"99991841593\",\n" +
            "      \"msupply\": \"100000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2321\",\n" +
            "      \"symbol\": \"BCH\",\n" +
            "      \"name\": \"Bitcoin Cash\",\n" +
            "      \"nameid\": \"bitcoin-cash\",\n" +
            "      \"rank\": 4,\n" +
            "      \"price_usd\": \"221.66\",\n" +
            "      \"percent_change_24h\": \"3.23\",\n" +
            "      \"percent_change_1h\": \"1.25\",\n" +
            "      \"percent_change_7d\": \"1.56\",\n" +
            "      \"price_btc\": \"0.034155\",\n" +
            "      \"market_cap_usd\": \"4066139952.99\",\n" +
            "      \"volume24\": 2187979200.0991755,\n" +
            "      \"volume24a\": 2038313362.1616404,\n" +
            "      \"csupply\": \"18343840.00\",\n" +
            "      \"tsupply\": \"18343840\",\n" +
            "      \"msupply\": \"21000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"518\",\n" +
            "      \"symbol\": \"USDT\",\n" +
            "      \"name\": \"Tether\",\n" +
            "      \"nameid\": \"tether\",\n" +
            "      \"rank\": 5,\n" +
            "      \"price_usd\": \"1.00\",\n" +
            "      \"percent_change_24h\": \"-0.69\",\n" +
            "      \"percent_change_1h\": \"-0.17\",\n" +
            "      \"percent_change_7d\": \"-0.21\",\n" +
            "      \"price_btc\": \"0.000154\",\n" +
            "      \"market_cap_usd\": \"4059492241.96\",\n" +
            "      \"volume24\": 33788916754.62141,\n" +
            "      \"volume24a\": 30245256999.70712,\n" +
            "      \"csupply\": \"4049107372.00\",\n" +
            "      \"tsupply\": \"4049107372\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33234\",\n" +
            "      \"symbol\": \"BCHSV\",\n" +
            "      \"name\": \"Bitcoin SV\",\n" +
            "      \"nameid\": \"bitcoin-cash-sv\",\n" +
            "      \"rank\": 6,\n" +
            "      \"price_usd\": \"166.96\",\n" +
            "      \"percent_change_24h\": \"6.38\",\n" +
            "      \"percent_change_1h\": \"1.43\",\n" +
            "      \"percent_change_7d\": \"0.01\",\n" +
            "      \"price_btc\": \"0.025727\",\n" +
            "      \"market_cap_usd\": \"3062348714.35\",\n" +
            "      \"volume24\": 1827635780.7714927,\n" +
            "      \"volume24a\": 1416927729.434786,\n" +
            "      \"csupply\": \"18341277.00\",\n" +
            "      \"tsupply\": \"21000000\",\n" +
            "      \"msupply\": \"21000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"1\",\n" +
            "      \"symbol\": \"LTC\",\n" +
            "      \"name\": \"Litecoin\",\n" +
            "      \"nameid\": \"litecoin\",\n" +
            "      \"rank\": 7,\n" +
            "      \"price_usd\": \"39.14\",\n" +
            "      \"percent_change_24h\": \"1.59\",\n" +
            "      \"percent_change_1h\": \"0.96\",\n" +
            "      \"percent_change_7d\": \"1.13\",\n" +
            "      \"price_btc\": \"0.006032\",\n" +
            "      \"market_cap_usd\": \"2529520399.15\",\n" +
            "      \"volume24\": 2964076626.928439,\n" +
            "      \"volume24a\": 2197786311.6321588,\n" +
            "      \"csupply\": \"64619858.00\",\n" +
            "      \"tsupply\": \"64619858\",\n" +
            "      \"msupply\": \"84000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2679\",\n" +
            "      \"symbol\": \"EOS\",\n" +
            "      \"name\": \"EOS\",\n" +
            "      \"nameid\": \"eos\",\n" +
            "      \"rank\": 8,\n" +
            "      \"price_usd\": \"2.22\",\n" +
            "      \"percent_change_24h\": \"1.21\",\n" +
            "      \"percent_change_1h\": \"0.53\",\n" +
            "      \"percent_change_7d\": \"-2.25\",\n" +
            "      \"price_btc\": \"0.000343\",\n" +
            "      \"market_cap_usd\": \"2066910253.60\",\n" +
            "      \"volume24\": 2124751780.4561183,\n" +
            "      \"volume24a\": 1917517767.8548903,\n" +
            "      \"csupply\": \"929000281.00\",\n" +
            "      \"tsupply\": \"1006245120\",\n" +
            "      \"msupply\": \"1006245120\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2710\",\n" +
            "      \"symbol\": \"BNB\",\n" +
            "      \"name\": \"Binance Coin\",\n" +
            "      \"nameid\": \"binance-coin\",\n" +
            "      \"rank\": 9,\n" +
            "      \"price_usd\": \"12.68\",\n" +
            "      \"percent_change_24h\": \"5.22\",\n" +
            "      \"percent_change_1h\": \"0.67\",\n" +
            "      \"percent_change_7d\": \"5.87\",\n" +
            "      \"price_btc\": \"0.001954\",\n" +
            "      \"market_cap_usd\": \"1971977967.14\",\n" +
            "      \"volume24\": 272510825.0840015,\n" +
            "      \"volume24a\": 191971113.7543728,\n" +
            "      \"csupply\": \"155536713.00\",\n" +
            "      \"tsupply\": \"192443301\",\n" +
            "      \"msupply\": \"200000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"3682\",\n" +
            "      \"symbol\": \"XTZ\",\n" +
            "      \"name\": \"Tezos\",\n" +
            "      \"nameid\": \"tezos\",\n" +
            "      \"rank\": 10,\n" +
            "      \"price_usd\": \"1.61\",\n" +
            "      \"percent_change_24h\": \"0.95\",\n" +
            "      \"percent_change_1h\": \"0.64\",\n" +
            "      \"percent_change_7d\": \"-2.92\",\n" +
            "      \"price_btc\": \"0.000247\",\n" +
            "      \"market_cap_usd\": \"1060169412.90\",\n" +
            "      \"volume24\": 71271131.76301841,\n" +
            "      \"volume24a\": 68429385.96503288,\n" +
            "      \"csupply\": \"660373612.00\",\n" +
            "      \"tsupply\": \"763306930\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33833\",\n" +
            "      \"symbol\": \"LEO\",\n" +
            "      \"name\": \"UNUS SED LEO\",\n" +
            "      \"nameid\": \"unus-sed-leo\",\n" +
            "      \"rank\": 11,\n" +
            "      \"price_usd\": \"1.04\",\n" +
            "      \"percent_change_24h\": \"2.71\",\n" +
            "      \"percent_change_1h\": \"0.59\",\n" +
            "      \"percent_change_7d\": \"1.02\",\n" +
            "      \"price_btc\": \"0.000161\",\n" +
            "      \"market_cap_usd\": \"1043983784.68\",\n" +
            "      \"volume24\": 2316501.1640797933,\n" +
            "      \"volume24a\": 1403343.5094949421,\n" +
            "      \"csupply\": \"999498893.00\",\n" +
            "      \"tsupply\": \"999498893\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"89\",\n" +
            "      \"symbol\": \"XLM\",\n" +
            "      \"name\": \"Stellar\",\n" +
            "      \"nameid\": \"stellar\",\n" +
            "      \"rank\": 12,\n" +
            "      \"price_usd\": \"0.040616\",\n" +
            "      \"percent_change_24h\": \"1.97\",\n" +
            "      \"percent_change_1h\": \"0.30\",\n" +
            "      \"percent_change_7d\": \"4.21\",\n" +
            "      \"price_btc\": \"0.000006\",\n" +
            "      \"market_cap_usd\": \"823844777.52\",\n" +
            "      \"volume24\": 268018260.49649882,\n" +
            "      \"volume24a\": 252708833.10669675,\n" +
            "      \"csupply\": \"20283516588.00\",\n" +
            "      \"tsupply\": \"104303927518\",\n" +
            "      \"msupply\": \"104303927518\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"28\",\n" +
            "      \"symbol\": \"XMR\",\n" +
            "      \"name\": \"Monero\",\n" +
            "      \"nameid\": \"monero\",\n" +
            "      \"rank\": 13,\n" +
            "      \"price_usd\": \"47.58\",\n" +
            "      \"percent_change_24h\": \"2.85\",\n" +
            "      \"percent_change_1h\": \"0.76\",\n" +
            "      \"percent_change_7d\": \"9.97\",\n" +
            "      \"price_btc\": \"0.007332\",\n" +
            "      \"market_cap_usd\": \"817198038.23\",\n" +
            "      \"volume24\": 120423802.8539899,\n" +
            "      \"volume24a\": 113286463.97433919,\n" +
            "      \"csupply\": \"17174299.00\",\n" +
            "      \"tsupply\": \"17174299\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"257\",\n" +
            "      \"symbol\": \"ADA\",\n" +
            "      \"name\": \"Cardano\",\n" +
            "      \"nameid\": \"cardano\",\n" +
            "      \"rank\": 14,\n" +
            "      \"price_usd\": \"0.030038\",\n" +
            "      \"percent_change_24h\": \"2.25\",\n" +
            "      \"percent_change_1h\": \"0.58\",\n" +
            "      \"percent_change_7d\": \"3.82\",\n" +
            "      \"price_btc\": \"0.000005\",\n" +
            "      \"market_cap_usd\": \"778808548.56\",\n" +
            "      \"volume24\": 68656884.8624597,\n" +
            "      \"volume24a\": 67248408.20769148,\n" +
            "      \"csupply\": \"25927070538.00\",\n" +
            "      \"tsupply\": \"31112483745\",\n" +
            "      \"msupply\": \"45000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2713\",\n" +
            "      \"symbol\": \"TRX\",\n" +
            "      \"name\": \"TRON\",\n" +
            "      \"nameid\": \"tron\",\n" +
            "      \"rank\": 15,\n" +
            "      \"price_usd\": \"0.011519\",\n" +
            "      \"percent_change_24h\": \"3.21\",\n" +
            "      \"percent_change_1h\": \"0.36\",\n" +
            "      \"percent_change_7d\": \"2.40\",\n" +
            "      \"price_btc\": \"0.000002\",\n" +
            "      \"market_cap_usd\": \"768124931.71\",\n" +
            "      \"volume24\": 554322108.9522917,\n" +
            "      \"volume24a\": 733655340.7118495,\n" +
            "      \"csupply\": \"66682072191.00\",\n" +
            "      \"tsupply\": \"99000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2751\",\n" +
            "      \"symbol\": \"LINK\",\n" +
            "      \"name\": \"ChainLink\",\n" +
            "      \"nameid\": \"chainlink\",\n" +
            "      \"rank\": 16,\n" +
            "      \"price_usd\": \"2.17\",\n" +
            "      \"percent_change_24h\": \"2.20\",\n" +
            "      \"percent_change_1h\": \"0.91\",\n" +
            "      \"percent_change_7d\": \"-0.84\",\n" +
            "      \"price_btc\": \"0.000334\",\n" +
            "      \"market_cap_usd\": \"758135564.95\",\n" +
            "      \"volume24\": 174300241.79110536,\n" +
            "      \"volume24a\": 170448262.41340798,\n" +
            "      \"csupply\": \"350000000.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": \"1000000000 \"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"8\",\n" +
            "      \"symbol\": \"DASH\",\n" +
            "      \"name\": \"Dash\",\n" +
            "      \"nameid\": \"dash\",\n" +
            "      \"rank\": 17,\n" +
            "      \"price_usd\": \"66.04\",\n" +
            "      \"percent_change_24h\": \"2.79\",\n" +
            "      \"percent_change_1h\": \"1.21\",\n" +
            "      \"percent_change_7d\": \"-4.68\",\n" +
            "      \"price_btc\": \"0.010176\",\n" +
            "      \"market_cap_usd\": \"620313872.10\",\n" +
            "      \"volume24\": 471190941.46283686,\n" +
            "      \"volume24a\": 478739648.56596535,\n" +
            "      \"csupply\": \"9393253.00\",\n" +
            "      \"tsupply\": \"9393253\",\n" +
            "      \"msupply\": \"18900000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"118\",\n" +
            "      \"symbol\": \"ETC\",\n" +
            "      \"name\": \"Ethereum Classic\",\n" +
            "      \"nameid\": \"ethereum-classic\",\n" +
            "      \"rank\": 18,\n" +
            "      \"price_usd\": \"4.96\",\n" +
            "      \"percent_change_24h\": \"0.30\",\n" +
            "      \"percent_change_1h\": \"0.59\",\n" +
            "      \"percent_change_7d\": \"1.52\",\n" +
            "      \"price_btc\": \"0.000764\",\n" +
            "      \"market_cap_usd\": \"560111542.01\",\n" +
            "      \"volume24\": 1437303228.3979251,\n" +
            "      \"volume24a\": 1534221721.5398505,\n" +
            "      \"csupply\": \"112980348.00\",\n" +
            "      \"tsupply\": \"112980348\",\n" +
            "      \"msupply\": \"210000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33538\",\n" +
            "      \"symbol\": \"MIN\",\n" +
            "      \"name\": \"MINDOL\",\n" +
            "      \"nameid\": \"mindol\",\n" +
            "      \"rank\": 19,\n" +
            "      \"price_usd\": \"3.07\",\n" +
            "      \"percent_change_24h\": \"13.32\",\n" +
            "      \"percent_change_1h\": \"-4.84\",\n" +
            "      \"percent_change_7d\": \"4.20\",\n" +
            "      \"price_btc\": \"0.000473\",\n" +
            "      \"market_cap_usd\": \"477092590.86\",\n" +
            "      \"volume24\": 755073.0088607317,\n" +
            "      \"volume24a\": 714667.2791810024,\n" +
            "      \"csupply\": \"155379617.00\",\n" +
            "      \"tsupply\": \"240000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33608\",\n" +
            "      \"symbol\": \"HEDG\",\n" +
            "      \"name\": \"HedgeTrade\",\n" +
            "      \"nameid\": \"hedgetrade\",\n" +
            "      \"rank\": 20,\n" +
            "      \"price_usd\": \"1.65\",\n" +
            "      \"percent_change_24h\": \"1.93\",\n" +
            "      \"percent_change_1h\": \"1.22\",\n" +
            "      \"percent_change_7d\": \"1.27\",\n" +
            "      \"price_btc\": \"0.000254\",\n" +
            "      \"market_cap_usd\": \"474949981.96\",\n" +
            "      \"volume24\": 453287.68460436526,\n" +
            "      \"volume24a\": 355023.51461420726,\n" +
            "      \"csupply\": \"288393355.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"133\",\n" +
            "      \"symbol\": \"NEO\",\n" +
            "      \"name\": \"Neo\",\n" +
            "      \"nameid\": \"neo\",\n" +
            "      \"rank\": 21,\n" +
            "      \"price_usd\": \"6.66\",\n" +
            "      \"percent_change_24h\": \"2.59\",\n" +
            "      \"percent_change_1h\": \"0.54\",\n" +
            "      \"percent_change_7d\": \"2.47\",\n" +
            "      \"price_btc\": \"0.001026\",\n" +
            "      \"market_cap_usd\": \"469689027.56\",\n" +
            "      \"volume24\": 394518801.2536051,\n" +
            "      \"volume24a\": 368298989.74558336,\n" +
            "      \"csupply\": \"70538831.00\",\n" +
            "      \"tsupply\": \"100000000\",\n" +
            "      \"msupply\": \"100000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33285\",\n" +
            "      \"symbol\": \"USDC\",\n" +
            "      \"name\": \"USD Coin\",\n" +
            "      \"nameid\": \"usd-coin\",\n" +
            "      \"rank\": 22,\n" +
            "      \"price_usd\": \"0.999264\",\n" +
            "      \"percent_change_24h\": \"0.01\",\n" +
            "      \"percent_change_1h\": \"0.00\",\n" +
            "      \"percent_change_7d\": \"0.10\",\n" +
            "      \"price_btc\": \"0.000154\",\n" +
            "      \"market_cap_usd\": \"434712249.41\",\n" +
            "      \"volume24\": 220244134.6974397,\n" +
            "      \"volume24a\": 227116138.820096,\n" +
            "      \"csupply\": \"435032301.00\",\n" +
            "      \"tsupply\": \"435032301\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33819\",\n" +
            "      \"symbol\": \"CRO\",\n" +
            "      \"name\": \"Crypto.com Chain\",\n" +
            "      \"nameid\": \"crypto-com-chain\",\n" +
            "      \"rank\": 23,\n" +
            "      \"price_usd\": \"0.043187\",\n" +
            "      \"percent_change_24h\": \"-1.22\",\n" +
            "      \"percent_change_1h\": \"0.26\",\n" +
            "      \"percent_change_7d\": \"7.40\",\n" +
            "      \"price_btc\": \"0.000007\",\n" +
            "      \"market_cap_usd\": \"400809819.82\",\n" +
            "      \"volume24\": 4862913.519351703,\n" +
            "      \"volume24a\": 5188456.684616178,\n" +
            "      \"csupply\": \"9280821918.00\",\n" +
            "      \"tsupply\": \"100000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"447\",\n" +
            "      \"symbol\": \"IOTA\",\n" +
            "      \"name\": \"IOTA\",\n" +
            "      \"nameid\": \"iota\",\n" +
            "      \"rank\": 24,\n" +
            "      \"price_usd\": \"0.142867\",\n" +
            "      \"percent_change_24h\": \"2.54\",\n" +
            "      \"percent_change_1h\": \"0.34\",\n" +
            "      \"percent_change_7d\": \"1.86\",\n" +
            "      \"price_btc\": \"0.000022\",\n" +
            "      \"market_cap_usd\": \"397104002.94\",\n" +
            "      \"volume24\": 11761270.962451197,\n" +
            "      \"volume24a\": 10242991.428581271,\n" +
            "      \"csupply\": \"2779530283.00\",\n" +
            "      \"tsupply\": \"2779530283\",\n" +
            "      \"msupply\": \"2779530283\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33830\",\n" +
            "      \"symbol\": \"ATOM\",\n" +
            "      \"name\": \"Cosmos\",\n" +
            "      \"nameid\": \"cosmos\",\n" +
            "      \"rank\": 25,\n" +
            "      \"price_usd\": \"1.97\",\n" +
            "      \"percent_change_24h\": \"-1.47\",\n" +
            "      \"percent_change_1h\": \"0.96\",\n" +
            "      \"percent_change_7d\": \"-6.18\",\n" +
            "      \"price_btc\": \"0.000303\",\n" +
            "      \"market_cap_usd\": \"375570401.39\",\n" +
            "      \"volume24\": 99686320.51967564,\n" +
            "      \"volume24a\": 73475826.21101771,\n" +
            "      \"csupply\": \"190688439.00\",\n" +
            "      \"tsupply\": \"237928231\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"70\",\n" +
            "      \"symbol\": \"NEM\",\n" +
            "      \"name\": \"NEM\",\n" +
            "      \"nameid\": \"nem\",\n" +
            "      \"rank\": 26,\n" +
            "      \"price_usd\": \"0.036848\",\n" +
            "      \"percent_change_24h\": \"-1.28\",\n" +
            "      \"percent_change_1h\": \"-0.32\",\n" +
            "      \"percent_change_7d\": \"-4.60\",\n" +
            "      \"price_btc\": \"0.000006\",\n" +
            "      \"market_cap_usd\": \"331631279.42\",\n" +
            "      \"volume24\": 29191824.487491157,\n" +
            "      \"volume24a\": 14913446.658392947,\n" +
            "      \"csupply\": \"8999999999.00\",\n" +
            "      \"tsupply\": \"8999999999\",\n" +
            "      \"msupply\": \"8999999999\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"12377\",\n" +
            "      \"symbol\": \"MKR\",\n" +
            "      \"name\": \"Maker\",\n" +
            "      \"nameid\": \"maker\",\n" +
            "      \"rank\": 27,\n" +
            "      \"price_usd\": \"294.61\",\n" +
            "      \"percent_change_24h\": \"-2.00\",\n" +
            "      \"percent_change_1h\": \"0.64\",\n" +
            "      \"percent_change_7d\": \"12.01\",\n" +
            "      \"price_btc\": \"0.045396\",\n" +
            "      \"market_cap_usd\": \"294614112.18\",\n" +
            "      \"volume24\": 3746461.4609689927,\n" +
            "      \"volume24a\": 4150960.618829648,\n" +
            "      \"csupply\": \"1000000.00\",\n" +
            "      \"tsupply\": \"1000000\",\n" +
            "      \"msupply\": \"1000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"134\",\n" +
            "      \"symbol\": \"ZEC\",\n" +
            "      \"name\": \"Zcash\",\n" +
            "      \"nameid\": \"zcash\",\n" +
            "      \"rank\": 28,\n" +
            "      \"price_usd\": \"30.76\",\n" +
            "      \"percent_change_24h\": \"2.21\",\n" +
            "      \"percent_change_1h\": \"0.52\",\n" +
            "      \"percent_change_7d\": \"-2.63\",\n" +
            "      \"price_btc\": \"0.004739\",\n" +
            "      \"market_cap_usd\": \"292066004.12\",\n" +
            "      \"volume24\": 343209847.2920671,\n" +
            "      \"volume24a\": 279771276.3454405,\n" +
            "      \"csupply\": \"9496456.00\",\n" +
            "      \"tsupply\": \"9496456\",\n" +
            "      \"msupply\": \"21000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33061\",\n" +
            "      \"symbol\": \"INB\",\n" +
            "      \"name\": \"Insight Chain\",\n" +
            "      \"nameid\": \"insight-chain\",\n" +
            "      \"rank\": 29,\n" +
            "      \"price_usd\": \"0.772500\",\n" +
            "      \"percent_change_24h\": \"6.03\",\n" +
            "      \"percent_change_1h\": \"-0.62\",\n" +
            "      \"percent_change_7d\": \"0.14\",\n" +
            "      \"price_btc\": \"0.000119\",\n" +
            "      \"market_cap_usd\": \"270299827.25\",\n" +
            "      \"volume24\": 19497376.496289615,\n" +
            "      \"volume24a\": 12664003.691155419,\n" +
            "      \"csupply\": \"349902689.00\",\n" +
            "      \"tsupply\": \"10000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2\",\n" +
            "      \"symbol\": \"DOGE\",\n" +
            "      \"name\": \"Dogecoin\",\n" +
            "      \"nameid\": \"dogecoin\",\n" +
            "      \"rank\": 30,\n" +
            "      \"price_usd\": \"0.001831\",\n" +
            "      \"percent_change_24h\": \"2.87\",\n" +
            "      \"percent_change_1h\": \"0.69\",\n" +
            "      \"percent_change_7d\": \"1.42\",\n" +
            "      \"price_btc\": \"2.82E-7\",\n" +
            "      \"market_cap_usd\": \"226529723.01\",\n" +
            "      \"volume24\": 125223404.7473892,\n" +
            "      \"volume24a\": 125056665.61087748,\n" +
            "      \"csupply\": \"123727126384.00\",\n" +
            "      \"tsupply\": \"123727126384\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32331\",\n" +
            "      \"symbol\": \"ONT\",\n" +
            "      \"name\": \"Ontology\",\n" +
            "      \"nameid\": \"ontology\",\n" +
            "      \"rank\": 31,\n" +
            "      \"price_usd\": \"0.367997\",\n" +
            "      \"percent_change_24h\": \"0.62\",\n" +
            "      \"percent_change_1h\": \"0.69\",\n" +
            "      \"percent_change_7d\": \"-0.08\",\n" +
            "      \"price_btc\": \"0.000057\",\n" +
            "      \"market_cap_usd\": \"196320364.61\",\n" +
            "      \"volume24\": 42577503.505420126,\n" +
            "      \"volume24a\": 43893798.07926236,\n" +
            "      \"csupply\": \"533483170.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32479\",\n" +
            "      \"symbol\": \"TUSD\",\n" +
            "      \"name\": \"TrueUSD\",\n" +
            "      \"nameid\": \"trueusd\",\n" +
            "      \"rank\": 32,\n" +
            "      \"price_usd\": \"0.998398\",\n" +
            "      \"percent_change_24h\": \"0.06\",\n" +
            "      \"percent_change_1h\": \"0.05\",\n" +
            "      \"percent_change_7d\": \"0.10\",\n" +
            "      \"price_btc\": \"0.000154\",\n" +
            "      \"market_cap_usd\": \"195170109.19\",\n" +
            "      \"volume24\": 380904288.9097123,\n" +
            "      \"volume24a\": 374604352.4009463,\n" +
            "      \"csupply\": \"195483256.00\",\n" +
            "      \"tsupply\": \"195483256\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33820\",\n" +
            "      \"symbol\": \"PAX\",\n" +
            "      \"name\": \"Paxos Standard Token\",\n" +
            "      \"nameid\": \"paxos-standard-token\",\n" +
            "      \"rank\": 33,\n" +
            "      \"price_usd\": \"0.998448\",\n" +
            "      \"percent_change_24h\": \"0.06\",\n" +
            "      \"percent_change_1h\": \"0.00\",\n" +
            "      \"percent_change_7d\": \"0.10\",\n" +
            "      \"price_btc\": \"0.000154\",\n" +
            "      \"market_cap_usd\": \"194065310.34\",\n" +
            "      \"volume24\": 409754362.8531661,\n" +
            "      \"volume24a\": 639667572.8277733,\n" +
            "      \"csupply\": \"194366961.00\",\n" +
            "      \"tsupply\": \"194366961\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"184\",\n" +
            "      \"symbol\": \"BAT\",\n" +
            "      \"name\": \"Basic Attention Token\",\n" +
            "      \"nameid\": \"basic-attention-token\",\n" +
            "      \"rank\": 34,\n" +
            "      \"price_usd\": \"0.139887\",\n" +
            "      \"percent_change_24h\": \"1.32\",\n" +
            "      \"percent_change_1h\": \"0.68\",\n" +
            "      \"percent_change_7d\": \"5.85\",\n" +
            "      \"price_btc\": \"0.000022\",\n" +
            "      \"market_cap_usd\": \"178947360.74\",\n" +
            "      \"volume24\": 57579852.27728433,\n" +
            "      \"volume24a\": 54531793.049187064,\n" +
            "      \"csupply\": \"1279225522.00\",\n" +
            "      \"tsupply\": \"1500000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2741\",\n" +
            "      \"symbol\": \"VET\",\n" +
            "      \"name\": \"VeChain\",\n" +
            "      \"nameid\": \"vechain\",\n" +
            "      \"rank\": 35,\n" +
            "      \"price_usd\": \"0.003007\",\n" +
            "      \"percent_change_24h\": \"1.05\",\n" +
            "      \"percent_change_1h\": \"0.56\",\n" +
            "      \"percent_change_7d\": \"6.65\",\n" +
            "      \"price_btc\": \"4.63E-7\",\n" +
            "      \"market_cap_usd\": \"166750447.77\",\n" +
            "      \"volume24\": 81101265.92606343,\n" +
            "      \"volume24a\": 75928149.16917193,\n" +
            "      \"csupply\": \"55454734800.00\",\n" +
            "      \"tsupply\": \"86712634466\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32351\",\n" +
            "      \"symbol\": \"HT\",\n" +
            "      \"name\": \"Huobi Token\",\n" +
            "      \"nameid\": \"huobi-token\",\n" +
            "      \"rank\": 36,\n" +
            "      \"price_usd\": \"3.30\",\n" +
            "      \"percent_change_24h\": \"2.90\",\n" +
            "      \"percent_change_1h\": \"0.49\",\n" +
            "      \"percent_change_7d\": \"0.11\",\n" +
            "      \"price_btc\": \"0.000508\",\n" +
            "      \"market_cap_usd\": \"165005375.38\",\n" +
            "      \"volume24\": 104067797.44340797,\n" +
            "      \"volume24a\": 133312429.66526636,\n" +
            "      \"csupply\": \"50000200.00\",\n" +
            "      \"tsupply\": \"500000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"99\",\n" +
            "      \"symbol\": \"DCR\",\n" +
            "      \"name\": \"Decred\",\n" +
            "      \"nameid\": \"decred\",\n" +
            "      \"rank\": 37,\n" +
            "      \"price_usd\": \"11.33\",\n" +
            "      \"percent_change_24h\": \"4.48\",\n" +
            "      \"percent_change_1h\": \"0.64\",\n" +
            "      \"percent_change_7d\": \"-1.32\",\n" +
            "      \"price_btc\": \"0.001746\",\n" +
            "      \"market_cap_usd\": \"127562332.59\",\n" +
            "      \"volume24\": 77219752.43021391,\n" +
            "      \"volume24a\": 57915784.01865584,\n" +
            "      \"csupply\": \"11255663.00\",\n" +
            "      \"tsupply\": \"11255663\",\n" +
            "      \"msupply\": \"21000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"285\",\n" +
            "      \"symbol\": \"BTG\",\n" +
            "      \"name\": \"Bitcoin Gold\",\n" +
            "      \"nameid\": \"bitcoingold\",\n" +
            "      \"rank\": 38,\n" +
            "      \"price_usd\": \"7.24\",\n" +
            "      \"percent_change_24h\": \"1.92\",\n" +
            "      \"percent_change_1h\": \"1.17\",\n" +
            "      \"percent_change_7d\": \"-3.00\",\n" +
            "      \"price_btc\": \"0.001116\",\n" +
            "      \"market_cap_usd\": \"124957158.22\",\n" +
            "      \"volume24\": 17807640.21036926,\n" +
            "      \"volume24a\": 16640249.327996854,\n" +
            "      \"csupply\": \"17248611.00\",\n" +
            "      \"tsupply\": \"17348611\",\n" +
            "      \"msupply\": \"21000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"129\",\n" +
            "      \"symbol\": \"REP\",\n" +
            "      \"name\": \"Augur\",\n" +
            "      \"nameid\": \"augur\",\n" +
            "      \"rank\": 39,\n" +
            "      \"price_usd\": \"10.62\",\n" +
            "      \"percent_change_24h\": \"7.69\",\n" +
            "      \"percent_change_1h\": \"0.70\",\n" +
            "      \"percent_change_7d\": \"24.44\",\n" +
            "      \"price_btc\": \"0.001636\",\n" +
            "      \"market_cap_usd\": \"116791307.61\",\n" +
            "      \"volume24\": 11134737.8803277,\n" +
            "      \"volume24a\": 10314323.956052866,\n" +
            "      \"csupply\": \"11000000.00\",\n" +
            "      \"tsupply\": \"11000000\",\n" +
            "      \"msupply\": \"11000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"237\",\n" +
            "      \"symbol\": \"QTUM\",\n" +
            "      \"name\": \"Qtum\",\n" +
            "      \"nameid\": \"qtum\",\n" +
            "      \"rank\": 40,\n" +
            "      \"price_usd\": \"1.20\",\n" +
            "      \"percent_change_24h\": \"0.75\",\n" +
            "      \"percent_change_1h\": \"0.15\",\n" +
            "      \"percent_change_7d\": \"-1.34\",\n" +
            "      \"price_btc\": \"0.000185\",\n" +
            "      \"market_cap_usd\": \"115533137.73\",\n" +
            "      \"volume24\": 283470217.6176509,\n" +
            "      \"volume24a\": 311874053.8493989,\n" +
            "      \"csupply\": \"95969372.00\",\n" +
            "      \"tsupply\": \"100909224\",\n" +
            "      \"msupply\": \"100909224\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"108\",\n" +
            "      \"symbol\": \"LSK\",\n" +
            "      \"name\": \"Lisk\",\n" +
            "      \"nameid\": \"lisk\",\n" +
            "      \"rank\": 41,\n" +
            "      \"price_usd\": \"0.961879\",\n" +
            "      \"percent_change_24h\": \"-1.61\",\n" +
            "      \"percent_change_1h\": \"-0.06\",\n" +
            "      \"percent_change_7d\": \"-6.31\",\n" +
            "      \"price_btc\": \"0.000148\",\n" +
            "      \"market_cap_usd\": \"115053395.22\",\n" +
            "      \"volume24\": 2393698.3198511982,\n" +
            "      \"volume24a\": 2831710.6953138313,\n" +
            "      \"csupply\": \"119613215.00\",\n" +
            "      \"tsupply\": \"125643660\",\n" +
            "      \"msupply\": \"159918400\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"3708\",\n" +
            "      \"symbol\": \"ICX\",\n" +
            "      \"name\": \"ICON\",\n" +
            "      \"nameid\": \"icon\",\n" +
            "      \"rank\": 42,\n" +
            "      \"price_usd\": \"0.206978\",\n" +
            "      \"percent_change_24h\": \"6.00\",\n" +
            "      \"percent_change_1h\": \"0.15\",\n" +
            "      \"percent_change_7d\": \"6.10\",\n" +
            "      \"price_btc\": \"0.000032\",\n" +
            "      \"market_cap_usd\": \"101513205.63\",\n" +
            "      \"volume24\": 22901375.56022443,\n" +
            "      \"volume24a\": 14881583.5491997,\n" +
            "      \"csupply\": \"490453303.00\",\n" +
            "      \"tsupply\": \"800460000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33821\",\n" +
            "      \"symbol\": \"ABBC\",\n" +
            "      \"name\": \"ABBC Coin\",\n" +
            "      \"nameid\": \"abbc-coin\",\n" +
            "      \"rank\": 43,\n" +
            "      \"price_usd\": \"0.092392\",\n" +
            "      \"percent_change_24h\": \"1.74\",\n" +
            "      \"percent_change_1h\": \"0.68\",\n" +
            "      \"percent_change_7d\": \"-3.62\",\n" +
            "      \"price_btc\": \"0.000014\",\n" +
            "      \"market_cap_usd\": \"92759529.31\",\n" +
            "      \"volume24\": 20042767.314579755,\n" +
            "      \"volume24a\": 16301013.248891907,\n" +
            "      \"csupply\": \"1003981087.00\",\n" +
            "      \"tsupply\": \"1003981087\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2729\",\n" +
            "      \"symbol\": \"ZRX\",\n" +
            "      \"name\": \"0x\",\n" +
            "      \"nameid\": \"0x\",\n" +
            "      \"rank\": 44,\n" +
            "      \"price_usd\": \"0.152004\",\n" +
            "      \"percent_change_24h\": \"0.65\",\n" +
            "      \"percent_change_1h\": \"-0.37\",\n" +
            "      \"percent_change_7d\": \"0.75\",\n" +
            "      \"price_btc\": \"0.000023\",\n" +
            "      \"market_cap_usd\": \"91274586.97\",\n" +
            "      \"volume24\": 11044356.309260366,\n" +
            "      \"volume24a\": 11308692.986935068,\n" +
            "      \"csupply\": \"600475853.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": \"1000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32073\",\n" +
            "      \"symbol\": \"BCD\",\n" +
            "      \"name\": \"Bitcoin Diamond\",\n" +
            "      \"nameid\": \"bitcoin-diamond\",\n" +
            "      \"rank\": 45,\n" +
            "      \"price_usd\": \"0.482560\",\n" +
            "      \"percent_change_24h\": \"5.63\",\n" +
            "      \"percent_change_1h\": \"1.01\",\n" +
            "      \"percent_change_7d\": \"-2.72\",\n" +
            "      \"price_btc\": \"0.000074\",\n" +
            "      \"market_cap_usd\": \"89994059.57\",\n" +
            "      \"volume24\": 6024951.903087423,\n" +
            "      \"volume24a\": 5444381.85530426,\n" +
            "      \"csupply\": \"186492898.00\",\n" +
            "      \"tsupply\": \"186492898\",\n" +
            "      \"msupply\": \"210000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33531\",\n" +
            "      \"symbol\": \"OKB\",\n" +
            "      \"name\": \"OKB\",\n" +
            "      \"nameid\": \"okb\",\n" +
            "      \"rank\": 46,\n" +
            "      \"price_usd\": \"4.32\",\n" +
            "      \"percent_change_24h\": \"3.97\",\n" +
            "      \"percent_change_1h\": \"1.39\",\n" +
            "      \"percent_change_7d\": \"2.51\",\n" +
            "      \"price_btc\": \"0.000666\",\n" +
            "      \"market_cap_usd\": \"86485931.66\",\n" +
            "      \"volume24\": 232818500.0866379,\n" +
            "      \"volume24a\": 225180996.58421105,\n" +
            "      \"csupply\": \"20000000.00\",\n" +
            "      \"tsupply\": \"300000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2750\",\n" +
            "      \"symbol\": \"KCS\",\n" +
            "      \"name\": \"KuCoin Shares\",\n" +
            "      \"nameid\": \"kucoin-shares\",\n" +
            "      \"rank\": 47,\n" +
            "      \"price_usd\": \"0.953612\",\n" +
            "      \"percent_change_24h\": \"2.86\",\n" +
            "      \"percent_change_1h\": \"0.78\",\n" +
            "      \"percent_change_7d\": \"-17.36\",\n" +
            "      \"price_btc\": \"0.000147\",\n" +
            "      \"market_cap_usd\": \"84628928.29\",\n" +
            "      \"volume24\": 7195998.305878718,\n" +
            "      \"volume24a\": 4261555.110545796,\n" +
            "      \"csupply\": \"88745681.00\",\n" +
            "      \"tsupply\": \"180730576\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"113\",\n" +
            "      \"symbol\": \"WAVES\",\n" +
            "      \"name\": \"Waves\",\n" +
            "      \"nameid\": \"waves\",\n" +
            "      \"rank\": 48,\n" +
            "      \"price_usd\": \"0.835066\",\n" +
            "      \"percent_change_24h\": \"2.03\",\n" +
            "      \"percent_change_1h\": \"1.05\",\n" +
            "      \"percent_change_7d\": \"-8.80\",\n" +
            "      \"price_btc\": \"0.000129\",\n" +
            "      \"market_cap_usd\": \"83506564.64\",\n" +
            "      \"volume24\": 39554326.88496337,\n" +
            "      \"volume24a\": 39222303.41948193,\n" +
            "      \"csupply\": \"100000000.00\",\n" +
            "      \"tsupply\": \"100000000\",\n" +
            "      \"msupply\": \"100000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32417\",\n" +
            "      \"symbol\": \"DAI\",\n" +
            "      \"name\": \"Dai\",\n" +
            "      \"nameid\": \"dai\",\n" +
            "      \"rank\": 49,\n" +
            "      \"price_usd\": \"1.02\",\n" +
            "      \"percent_change_24h\": \"-0.42\",\n" +
            "      \"percent_change_1h\": \"0.18\",\n" +
            "      \"percent_change_7d\": \"-1.33\",\n" +
            "      \"price_btc\": \"0.000158\",\n" +
            "      \"market_cap_usd\": \"80013752.00\",\n" +
            "      \"volume24\": 10528999.23727313,\n" +
            "      \"volume24a\": 9674585.826618753,\n" +
            "      \"csupply\": \"78262606.00\",\n" +
            "      \"tsupply\": \"78262606\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"22\",\n" +
            "      \"symbol\": \"MONA\",\n" +
            "      \"name\": \"MonaCoin\",\n" +
            "      \"nameid\": \"monacoin\",\n" +
            "      \"rank\": 50,\n" +
            "      \"price_usd\": \"1.21\",\n" +
            "      \"percent_change_24h\": \"4.55\",\n" +
            "      \"percent_change_1h\": \"0.47\",\n" +
            "      \"percent_change_7d\": \"-2.96\",\n" +
            "      \"price_btc\": \"0.000186\",\n" +
            "      \"market_cap_usd\": \"79542469.45\",\n" +
            "      \"volume24\": 3899804.1569916336,\n" +
            "      \"volume24a\": 4103958.436258136,\n" +
            "      \"csupply\": \"65729675.00\",\n" +
            "      \"tsupply\": \"65729675\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"211\",\n" +
            "      \"symbol\": \"MCO\",\n" +
            "      \"name\": \"Crypto.com\",\n" +
            "      \"nameid\": \"monaco\",\n" +
            "      \"rank\": 51,\n" +
            "      \"price_usd\": \"4.87\",\n" +
            "      \"percent_change_24h\": \"5.99\",\n" +
            "      \"percent_change_1h\": \"0.86\",\n" +
            "      \"percent_change_7d\": \"5.94\",\n" +
            "      \"price_btc\": \"0.000750\",\n" +
            "      \"market_cap_usd\": \"76869861.18\",\n" +
            "      \"volume24\": 32244356.87146119,\n" +
            "      \"volume24a\": 28864084.090475716,\n" +
            "      \"csupply\": \"15793831.00\",\n" +
            "      \"tsupply\": \"31587682\",\n" +
            "      \"msupply\": \"31587682.3632061\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33723\",\n" +
            "      \"symbol\": \"SNX\",\n" +
            "      \"name\": \"Synthetix Network Token\",\n" +
            "      \"nameid\": \"synthetix-network-token\",\n" +
            "      \"rank\": 52,\n" +
            "      \"price_usd\": \"0.603381\",\n" +
            "      \"percent_change_24h\": \"3.39\",\n" +
            "      \"percent_change_1h\": \"1.02\",\n" +
            "      \"percent_change_7d\": \"27.74\",\n" +
            "      \"price_btc\": \"0.000093\",\n" +
            "      \"market_cap_usd\": \"76001148.07\",\n" +
            "      \"volume24\": 1491886.5309503796,\n" +
            "      \"volume24a\": 636887.8817558949,\n" +
            "      \"csupply\": \"125958830.00\",\n" +
            "      \"tsupply\": \"125958830\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2515\",\n" +
            "      \"symbol\": \"KNC\",\n" +
            "      \"name\": \"Kyber Network\",\n" +
            "      \"nameid\": \"kyber-network\",\n" +
            "      \"rank\": 53,\n" +
            "      \"price_usd\": \"0.444630\",\n" +
            "      \"percent_change_24h\": \"1.79\",\n" +
            "      \"percent_change_1h\": \"1.20\",\n" +
            "      \"percent_change_7d\": \"-3.44\",\n" +
            "      \"price_btc\": \"0.000069\",\n" +
            "      \"market_cap_usd\": \"74637664.57\",\n" +
            "      \"volume24\": 38722286.01608184,\n" +
            "      \"volume24a\": 41301605.86048986,\n" +
            "      \"csupply\": \"167864614.00\",\n" +
            "      \"tsupply\": \"215625349\",\n" +
            "      \"msupply\": \"226000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2581\",\n" +
            "      \"symbol\": \"ENJ\",\n" +
            "      \"name\": \"Enjin Coin\",\n" +
            "      \"nameid\": \"enjin-coin\",\n" +
            "      \"rank\": 54,\n" +
            "      \"price_usd\": \"0.093789\",\n" +
            "      \"percent_change_24h\": \"5.68\",\n" +
            "      \"percent_change_1h\": \"1.48\",\n" +
            "      \"percent_change_7d\": \"26.67\",\n" +
            "      \"price_btc\": \"0.000014\",\n" +
            "      \"market_cap_usd\": \"72806550.49\",\n" +
            "      \"volume24\": 7843341.704542837,\n" +
            "      \"volume24a\": 5709791.832914382,\n" +
            "      \"csupply\": \"776278713.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"232\",\n" +
            "      \"symbol\": \"OMG\",\n" +
            "      \"name\": \"OmiseGO\",\n" +
            "      \"nameid\": \"omisego\",\n" +
            "      \"rank\": 55,\n" +
            "      \"price_usd\": \"0.514585\",\n" +
            "      \"percent_change_24h\": \"3.03\",\n" +
            "      \"percent_change_1h\": \"0.49\",\n" +
            "      \"percent_change_7d\": \"5.78\",\n" +
            "      \"price_btc\": \"0.000079\",\n" +
            "      \"market_cap_usd\": \"72168141.54\",\n" +
            "      \"volume24\": 107278121.49071403,\n" +
            "      \"volume24a\": 123107733.59010656,\n" +
            "      \"csupply\": \"140245398.00\",\n" +
            "      \"tsupply\": \"140245398\",\n" +
            "      \"msupply\": \"140245398\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32386\",\n" +
            "      \"symbol\": \"RVN\",\n" +
            "      \"name\": \"Ravencoin\",\n" +
            "      \"nameid\": \"ravencoin\",\n" +
            "      \"rank\": 56,\n" +
            "      \"price_usd\": \"0.014946\",\n" +
            "      \"percent_change_24h\": \"3.77\",\n" +
            "      \"percent_change_1h\": \"0.62\",\n" +
            "      \"percent_change_7d\": \"3.34\",\n" +
            "      \"price_btc\": \"0.000002\",\n" +
            "      \"market_cap_usd\": \"63917328.31\",\n" +
            "      \"volume24\": 8929511.376629554,\n" +
            "      \"volume24a\": 7524891.573167334,\n" +
            "      \"csupply\": \"4276480000.00\",\n" +
            "      \"tsupply\": \"4276480000\",\n" +
            "      \"msupply\": \"21000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2835\",\n" +
            "      \"symbol\": \"NANO\",\n" +
            "      \"name\": \"Nano\",\n" +
            "      \"nameid\": \"nano\",\n" +
            "      \"rank\": 57,\n" +
            "      \"price_usd\": \"0.467947\",\n" +
            "      \"percent_change_24h\": \"1.51\",\n" +
            "      \"percent_change_1h\": \"-0.18\",\n" +
            "      \"percent_change_7d\": \"6.24\",\n" +
            "      \"price_btc\": \"0.000072\",\n" +
            "      \"market_cap_usd\": \"62353084.48\",\n" +
            "      \"volume24\": 2382586.06961266,\n" +
            "      \"volume24a\": 2001057.4764148938,\n" +
            "      \"csupply\": \"133248297.00\",\n" +
            "      \"tsupply\": \"133248297\",\n" +
            "      \"msupply\": \"133248297\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"207\",\n" +
            "      \"symbol\": \"SNT\",\n" +
            "      \"name\": \"Status Network Token\",\n" +
            "      \"nameid\": \"status\",\n" +
            "      \"rank\": 58,\n" +
            "      \"price_usd\": \"0.017846\",\n" +
            "      \"percent_change_24h\": \"-3.39\",\n" +
            "      \"percent_change_1h\": \"-0.41\",\n" +
            "      \"percent_change_7d\": \"14.49\",\n" +
            "      \"price_btc\": \"0.000003\",\n" +
            "      \"market_cap_usd\": \"61934681.63\",\n" +
            "      \"volume24\": 39469401.93674117,\n" +
            "      \"volume24a\": 53955403.5840438,\n" +
            "      \"csupply\": \"3470483788.00\",\n" +
            "      \"tsupply\": \"6804870174\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32604\",\n" +
            "      \"symbol\": \"NEXO\",\n" +
            "      \"name\": \"Nexo\",\n" +
            "      \"nameid\": \"nexo\",\n" +
            "      \"rank\": 59,\n" +
            "      \"price_usd\": \"0.107260\",\n" +
            "      \"percent_change_24h\": \"2.20\",\n" +
            "      \"percent_change_1h\": \"0.41\",\n" +
            "      \"percent_change_7d\": \"2.66\",\n" +
            "      \"price_btc\": \"0.000017\",\n" +
            "      \"market_cap_usd\": \"60065763.21\",\n" +
            "      \"volume24\": 9752967.667499848,\n" +
            "      \"volume24a\": 10030047.333106514,\n" +
            "      \"csupply\": \"560000011.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33071\",\n" +
            "      \"symbol\": \"DX\",\n" +
            "      \"name\": \"DxChain Token\",\n" +
            "      \"nameid\": \"dxchain-token\",\n" +
            "      \"rank\": 60,\n" +
            "      \"price_usd\": \"0.001265\",\n" +
            "      \"percent_change_24h\": \"5.21\",\n" +
            "      \"percent_change_1h\": \"-0.92\",\n" +
            "      \"percent_change_7d\": \"-1.80\",\n" +
            "      \"price_btc\": \"1.95E-7\",\n" +
            "      \"market_cap_usd\": \"58485053.10\",\n" +
            "      \"volume24\": 1430780.8500929626,\n" +
            "      \"volume24a\": 1341549.1300957685,\n" +
            "      \"csupply\": \"46250000000.00\",\n" +
            "      \"tsupply\": \"100000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"43\",\n" +
            "      \"symbol\": \"DGB\",\n" +
            "      \"name\": \"Digibyte\",\n" +
            "      \"nameid\": \"digibyte\",\n" +
            "      \"rank\": 61,\n" +
            "      \"price_usd\": \"0.004480\",\n" +
            "      \"percent_change_24h\": \"1.54\",\n" +
            "      \"percent_change_1h\": \"0.85\",\n" +
            "      \"percent_change_7d\": \"30.42\",\n" +
            "      \"price_btc\": \"6.90E-7\",\n" +
            "      \"market_cap_usd\": \"58013831.92\",\n" +
            "      \"volume24\": 895007.0031731882,\n" +
            "      \"volume24a\": 807957.495041425,\n" +
            "      \"csupply\": \"12950710845.00\",\n" +
            "      \"tsupply\": \"12950710845\",\n" +
            "      \"msupply\": \"21000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2482\",\n" +
            "      \"symbol\": \"BTM\",\n" +
            "      \"name\": \"Bytom\",\n" +
            "      \"nameid\": \"bytom\",\n" +
            "      \"rank\": 62,\n" +
            "      \"price_usd\": \"0.056869\",\n" +
            "      \"percent_change_24h\": \"-4.12\",\n" +
            "      \"percent_change_1h\": \"-0.25\",\n" +
            "      \"percent_change_7d\": \"3.03\",\n" +
            "      \"price_btc\": \"0.000009\",\n" +
            "      \"market_cap_usd\": \"57010701.24\",\n" +
            "      \"volume24\": 153675269.7763792,\n" +
            "      \"volume24a\": 120154690.32165119,\n" +
            "      \"csupply\": \"1002499275.00\",\n" +
            "      \"tsupply\": \"1407000000\",\n" +
            "      \"msupply\": \"1407000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"183\",\n" +
            "      \"symbol\": \"SC\",\n" +
            "      \"name\": \"Siacoin\",\n" +
            "      \"nameid\": \"siacoin\",\n" +
            "      \"rank\": 63,\n" +
            "      \"price_usd\": \"0.001266\",\n" +
            "      \"percent_change_24h\": \"0.97\",\n" +
            "      \"percent_change_1h\": \"0.47\",\n" +
            "      \"percent_change_7d\": \"-2.46\",\n" +
            "      \"price_btc\": \"1.95E-7\",\n" +
            "      \"market_cap_usd\": \"52944629.72\",\n" +
            "      \"volume24\": 2456308.561098114,\n" +
            "      \"volume24a\": 2686753.2031974597,\n" +
            "      \"csupply\": \"41817047634.00\",\n" +
            "      \"tsupply\": \"41817047634\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32957\",\n" +
            "      \"symbol\": \"NRG\",\n" +
            "      \"name\": \"Energi\",\n" +
            "      \"nameid\": \"energi\",\n" +
            "      \"rank\": 64,\n" +
            "      \"price_usd\": \"1.93\",\n" +
            "      \"percent_change_24h\": \"6.15\",\n" +
            "      \"percent_change_1h\": \"1.20\",\n" +
            "      \"percent_change_7d\": \"44.03\",\n" +
            "      \"price_btc\": \"0.000297\",\n" +
            "      \"market_cap_usd\": \"51835532.42\",\n" +
            "      \"volume24\": 632404.4568513347,\n" +
            "      \"volume24a\": 334167.4572201542,\n" +
            "      \"csupply\": \"26892599.00\",\n" +
            "      \"tsupply\": \"26892599\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32360\",\n" +
            "      \"symbol\": \"THETA\",\n" +
            "      \"name\": \"Theta Token\",\n" +
            "      \"nameid\": \"theta-token\",\n" +
            "      \"rank\": 65,\n" +
            "      \"price_usd\": \"0.073293\",\n" +
            "      \"percent_change_24h\": \"3.85\",\n" +
            "      \"percent_change_1h\": \"1.00\",\n" +
            "      \"percent_change_7d\": \"6.53\",\n" +
            "      \"price_btc\": \"0.000011\",\n" +
            "      \"market_cap_usd\": \"51781396.81\",\n" +
            "      \"volume24\": 2070524.6889710035,\n" +
            "      \"volume24a\": 1851145.4226373967,\n" +
            "      \"csupply\": \"706502689.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": null\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"111\",\n" +
            "      \"symbol\": \"DGD\",\n" +
            "      \"name\": \"DigixDAO\",\n" +
            "      \"nameid\": \"digixdao\",\n" +
            "      \"rank\": 66,\n" +
            "      \"price_usd\": \"25.56\",\n" +
            "      \"percent_change_24h\": \"1.59\",\n" +
            "      \"percent_change_1h\": \"0.17\",\n" +
            "      \"percent_change_7d\": \"1.95\",\n" +
            "      \"price_btc\": \"0.003938\",\n" +
            "      \"market_cap_usd\": \"51111074.68\",\n" +
            "      \"volume24\": 956872.1558456342,\n" +
            "      \"volume24a\": 889517.5384572007,\n" +
            "      \"csupply\": \"2000000.00\",\n" +
            "      \"tsupply\": \"2000000\",\n" +
            "      \"msupply\": \"2000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"106\",\n" +
            "      \"symbol\": \"STEEM\",\n" +
            "      \"name\": \"STEEM\",\n" +
            "      \"nameid\": \"steem\",\n" +
            "      \"rank\": 67,\n" +
            "      \"price_usd\": \"0.143465\",\n" +
            "      \"percent_change_24h\": \"0.10\",\n" +
            "      \"percent_change_1h\": \"1.85\",\n" +
            "      \"percent_change_7d\": \"-14.04\",\n" +
            "      \"price_btc\": \"0.000022\",\n" +
            "      \"market_cap_usd\": \"49116161.41\",\n" +
            "      \"volume24\": 1530930.9015388333,\n" +
            "      \"volume24a\": 1658221.5994182145,\n" +
            "      \"csupply\": \"342356149.00\",\n" +
            "      \"tsupply\": \"342356149\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33391\",\n" +
            "      \"symbol\": \"BTT\",\n" +
            "      \"name\": \"BitTorrent\",\n" +
            "      \"nameid\": \"bittorrent\",\n" +
            "      \"rank\": 68,\n" +
            "      \"price_usd\": \"0.000221\",\n" +
            "      \"percent_change_24h\": \"2.85\",\n" +
            "      \"percent_change_1h\": \"-0.04\",\n" +
            "      \"percent_change_7d\": \"1.62\",\n" +
            "      \"price_btc\": \"3.41E-8\",\n" +
            "      \"market_cap_usd\": \"46901045.73\",\n" +
            "      \"volume24\": 4561029.262687513,\n" +
            "      \"volume24a\": 4072244.75629671,\n" +
            "      \"csupply\": \"212116500000.00\",\n" +
            "      \"tsupply\": \"990000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33085\",\n" +
            "      \"symbol\": \"QNT\",\n" +
            "      \"name\": \"Quant\",\n" +
            "      \"nameid\": \"quant\",\n" +
            "      \"rank\": 69,\n" +
            "      \"price_usd\": \"3.82\",\n" +
            "      \"percent_change_24h\": \"6.77\",\n" +
            "      \"percent_change_1h\": \"2.06\",\n" +
            "      \"percent_change_7d\": \"66.19\",\n" +
            "      \"price_btc\": \"0.000589\",\n" +
            "      \"market_cap_usd\": \"46163618.45\",\n" +
            "      \"volume24\": 3183937.6706699184,\n" +
            "      \"volume24a\": 3083113.5532789617,\n" +
            "      \"csupply\": \"12072738.00\",\n" +
            "      \"tsupply\": \"45467000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32686\",\n" +
            "      \"symbol\": \"HOT\",\n" +
            "      \"name\": \"Holo\",\n" +
            "      \"nameid\": \"holo\",\n" +
            "      \"rank\": 70,\n" +
            "      \"price_usd\": \"0.000337\",\n" +
            "      \"percent_change_24h\": \"-0.24\",\n" +
            "      \"percent_change_1h\": \"1.50\",\n" +
            "      \"percent_change_7d\": \"3.73\",\n" +
            "      \"price_btc\": \"5.20E-8\",\n" +
            "      \"market_cap_usd\": \"44917472.82\",\n" +
            "      \"volume24\": 3025579.6836372665,\n" +
            "      \"volume24a\": 3189699.038835561,\n" +
            "      \"csupply\": \"133214575156.00\",\n" +
            "      \"tsupply\": \"177619433541\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"54\",\n" +
            "      \"symbol\": \"BTS\",\n" +
            "      \"name\": \"BitShares\",\n" +
            "      \"nameid\": \"bitshares\",\n" +
            "      \"rank\": 71,\n" +
            "      \"price_usd\": \"0.016237\",\n" +
            "      \"percent_change_24h\": \"1.23\",\n" +
            "      \"percent_change_1h\": \"0.50\",\n" +
            "      \"percent_change_7d\": \"-4.06\",\n" +
            "      \"price_btc\": \"0.000003\",\n" +
            "      \"market_cap_usd\": \"44504961.27\",\n" +
            "      \"volume24\": 2741853.638851576,\n" +
            "      \"volume24a\": 5878258.4968872545,\n" +
            "      \"csupply\": \"2740910000.00\",\n" +
            "      \"tsupply\": \"2740910000\",\n" +
            "      \"msupply\": \"3600570502\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"139\",\n" +
            "      \"symbol\": \"KMD\",\n" +
            "      \"name\": \"Komodo\",\n" +
            "      \"nameid\": \"komodo\",\n" +
            "      \"rank\": 72,\n" +
            "      \"price_usd\": \"0.365620\",\n" +
            "      \"percent_change_24h\": \"2.82\",\n" +
            "      \"percent_change_1h\": \"1.67\",\n" +
            "      \"percent_change_7d\": \"0.37\",\n" +
            "      \"price_btc\": \"0.000056\",\n" +
            "      \"market_cap_usd\": \"42281141.39\",\n" +
            "      \"volume24\": 1563458.1683239825,\n" +
            "      \"volume24a\": 1873951.3972746837,\n" +
            "      \"csupply\": \"115642437.00\",\n" +
            "      \"tsupply\": \"115642437\",\n" +
            "      \"msupply\": \"200000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33228\",\n" +
            "      \"symbol\": \"HC\",\n" +
            "      \"name\": \"HyperCash\",\n" +
            "      \"nameid\": \"hypercash\",\n" +
            "      \"rank\": 73,\n" +
            "      \"price_usd\": \"0.968970\",\n" +
            "      \"percent_change_24h\": \"2.02\",\n" +
            "      \"percent_change_1h\": \"0.09\",\n" +
            "      \"percent_change_7d\": \"-3.46\",\n" +
            "      \"price_btc\": \"0.000149\",\n" +
            "      \"market_cap_usd\": \"42179059.44\",\n" +
            "      \"volume24\": 654921.8336350471,\n" +
            "      \"volume24a\": 621714.898836969,\n" +
            "      \"csupply\": \"43529781.00\",\n" +
            "      \"tsupply\": \"43529781\",\n" +
            "      \"msupply\": \"84000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"186\",\n" +
            "      \"symbol\": \"ZEN\",\n" +
            "      \"name\": \"Horizen\",\n" +
            "      \"nameid\": \"zencash\",\n" +
            "      \"rank\": 74,\n" +
            "      \"price_usd\": \"5.70\",\n" +
            "      \"percent_change_24h\": \"-0.71\",\n" +
            "      \"percent_change_1h\": \"0.11\",\n" +
            "      \"percent_change_7d\": \"6.74\",\n" +
            "      \"price_btc\": \"0.000878\",\n" +
            "      \"market_cap_usd\": \"40940133.16\",\n" +
            "      \"volume24\": 1567127.4364542093,\n" +
            "      \"volume24a\": 1833159.7961241605,\n" +
            "      \"csupply\": \"7185725.00\",\n" +
            "      \"tsupply\": \"7185725\",\n" +
            "      \"msupply\": \"21000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"34406\",\n" +
            "      \"symbol\": \"ALGO\",\n" +
            "      \"name\": \"Algorand\",\n" +
            "      \"nameid\": \"algorand\",\n" +
            "      \"rank\": 75,\n" +
            "      \"price_usd\": \"0.155267\",\n" +
            "      \"percent_change_24h\": \"1.72\",\n" +
            "      \"percent_change_1h\": \"0.88\",\n" +
            "      \"percent_change_7d\": \"-0.71\",\n" +
            "      \"price_btc\": \"0.000024\",\n" +
            "      \"market_cap_usd\": \"40254021.80\",\n" +
            "      \"volume24\": 36797424.175784454,\n" +
            "      \"volume24a\": 35339154.14759588,\n" +
            "      \"csupply\": \"259256762.00\",\n" +
            "      \"tsupply\": \"2588969743\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33535\",\n" +
            "      \"symbol\": \"VSYS\",\n" +
            "      \"name\": \"V Systems\",\n" +
            "      \"nameid\": \"v-systems\",\n" +
            "      \"rank\": 76,\n" +
            "      \"price_usd\": \"0.022366\",\n" +
            "      \"percent_change_24h\": \"2.71\",\n" +
            "      \"percent_change_1h\": \"1.05\",\n" +
            "      \"percent_change_7d\": \"-7.68\",\n" +
            "      \"price_btc\": \"0.000003\",\n" +
            "      \"market_cap_usd\": \"40008726.49\",\n" +
            "      \"volume24\": 4213438.408943056,\n" +
            "      \"volume24a\": 4142609.035027173,\n" +
            "      \"csupply\": \"1788818695.00\",\n" +
            "      \"tsupply\": \"5217805440\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"102\",\n" +
            "      \"symbol\": \"XVG\",\n" +
            "      \"name\": \"Verge\",\n" +
            "      \"nameid\": \"verge\",\n" +
            "      \"rank\": 77,\n" +
            "      \"price_usd\": \"0.002472\",\n" +
            "      \"percent_change_24h\": \"-1.78\",\n" +
            "      \"percent_change_1h\": \"0.64\",\n" +
            "      \"percent_change_7d\": \"0.32\",\n" +
            "      \"price_btc\": \"3.81E-7\",\n" +
            "      \"market_cap_usd\": \"39307224.11\",\n" +
            "      \"volume24\": 1044936.3135043834,\n" +
            "      \"volume24a\": 1535181.6902132186,\n" +
            "      \"csupply\": \"15900663549.00\",\n" +
            "      \"tsupply\": \"15900663549\",\n" +
            "      \"msupply\": \"16555000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33529\",\n" +
            "      \"symbol\": \"ZB\",\n" +
            "      \"name\": \"ZB\",\n" +
            "      \"nameid\": \"zb\",\n" +
            "      \"rank\": 78,\n" +
            "      \"price_usd\": \"0.222407\",\n" +
            "      \"percent_change_24h\": \"-0.38\",\n" +
            "      \"percent_change_1h\": \"-1.08\",\n" +
            "      \"percent_change_7d\": \"-4.15\",\n" +
            "      \"price_btc\": \"0.000034\",\n" +
            "      \"market_cap_usd\": \"36296529.38\",\n" +
            "      \"volume24\": 20715898.033364717,\n" +
            "      \"volume24a\": 33948490.704275556,\n" +
            "      \"csupply\": \"163198810.00\",\n" +
            "      \"tsupply\": \"2100000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32229\",\n" +
            "      \"symbol\": \"IOST\",\n" +
            "      \"name\": \"IOStoken\",\n" +
            "      \"nameid\": \"iostoken\",\n" +
            "      \"rank\": 79,\n" +
            "      \"price_usd\": \"0.002996\",\n" +
            "      \"percent_change_24h\": \"2.73\",\n" +
            "      \"percent_change_1h\": \"0.97\",\n" +
            "      \"percent_change_7d\": \"-6.94\",\n" +
            "      \"price_btc\": \"4.62E-7\",\n" +
            "      \"market_cap_usd\": \"35990469.98\",\n" +
            "      \"volume24\": 22110643.167513765,\n" +
            "      \"volume24a\": 20710403.488913044,\n" +
            "      \"csupply\": \"12013965609.00\",\n" +
            "      \"tsupply\": \"21000000000\",\n" +
            "      \"msupply\": \"21000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32764\",\n" +
            "      \"symbol\": \"SEELE\",\n" +
            "      \"name\": \"Seele\",\n" +
            "      \"nameid\": \"seele\",\n" +
            "      \"rank\": 80,\n" +
            "      \"price_usd\": \"0.048836\",\n" +
            "      \"percent_change_24h\": \"2.06\",\n" +
            "      \"percent_change_1h\": \"0.33\",\n" +
            "      \"percent_change_7d\": \"-3.23\",\n" +
            "      \"price_btc\": \"0.000008\",\n" +
            "      \"market_cap_usd\": \"33832752.54\",\n" +
            "      \"volume24\": 11564472.313928412,\n" +
            "      \"volume24a\": 10796753.345570087,\n" +
            "      \"csupply\": \"692776387.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32334\",\n" +
            "      \"symbol\": \"ZIL\",\n" +
            "      \"name\": \"Zilliqa\",\n" +
            "      \"nameid\": \"zilliqa\",\n" +
            "      \"rank\": 81,\n" +
            "      \"price_usd\": \"0.003834\",\n" +
            "      \"percent_change_24h\": \"3.05\",\n" +
            "      \"percent_change_1h\": \"0.42\",\n" +
            "      \"percent_change_7d\": \"0.41\",\n" +
            "      \"price_btc\": \"5.91E-7\",\n" +
            "      \"market_cap_usd\": \"33303349.10\",\n" +
            "      \"volume24\": 6424917.22901486,\n" +
            "      \"volume24a\": 6221997.222857851,\n" +
            "      \"csupply\": \"8687360058.00\",\n" +
            "      \"tsupply\": \"12600000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"156\",\n" +
            "      \"symbol\": \"GNT\",\n" +
            "      \"name\": \"Golem\",\n" +
            "      \"nameid\": \"golem-network-tokens\",\n" +
            "      \"rank\": 82,\n" +
            "      \"price_usd\": \"0.033790\",\n" +
            "      \"percent_change_24h\": \"2.88\",\n" +
            "      \"percent_change_1h\": \"1.05\",\n" +
            "      \"percent_change_7d\": \"-2.88\",\n" +
            "      \"price_btc\": \"0.000005\",\n" +
            "      \"market_cap_usd\": \"32588471.96\",\n" +
            "      \"volume24\": 2301115.6828159713,\n" +
            "      \"volume24a\": 1904348.6736703878,\n" +
            "      \"csupply\": \"964450000.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"131\",\n" +
            "      \"symbol\": \"ARDR\",\n" +
            "      \"name\": \"Ardor\",\n" +
            "      \"nameid\": \"ardor\",\n" +
            "      \"rank\": 83,\n" +
            "      \"price_usd\": \"0.032618\",\n" +
            "      \"percent_change_24h\": \"4.08\",\n" +
            "      \"percent_change_1h\": \"0.39\",\n" +
            "      \"percent_change_7d\": \"-3.21\",\n" +
            "      \"price_btc\": \"0.000005\",\n" +
            "      \"market_cap_usd\": \"32584953.38\",\n" +
            "      \"volume24\": 569168.9739906567,\n" +
            "      \"volume24a\": 585230.1904454406,\n" +
            "      \"csupply\": \"998999495.00\",\n" +
            "      \"tsupply\": \"998999495\",\n" +
            "      \"msupply\": \"998999495\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2765\",\n" +
            "      \"symbol\": \"DATA\",\n" +
            "      \"name\": \"Streamr DATAcoin\",\n" +
            "      \"nameid\": \"streamr-datacoin\",\n" +
            "      \"rank\": 84,\n" +
            "      \"price_usd\": \"0.045629\",\n" +
            "      \"percent_change_24h\": \"2.76\",\n" +
            "      \"percent_change_1h\": \"-1.68\",\n" +
            "      \"percent_change_7d\": \"56.69\",\n" +
            "      \"price_btc\": \"0.000007\",\n" +
            "      \"market_cap_usd\": \"30898070.04\",\n" +
            "      \"volume24\": 4016525.86924237,\n" +
            "      \"volume24a\": 4220789.312201907,\n" +
            "      \"csupply\": \"677154514.00\",\n" +
            "      \"tsupply\": \"987154514\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32226\",\n" +
            "      \"symbol\": \"ELF\",\n" +
            "      \"name\": \"aelf\",\n" +
            "      \"nameid\": \"aelf\",\n" +
            "      \"rank\": 85,\n" +
            "      \"price_usd\": \"0.060534\",\n" +
            "      \"percent_change_24h\": \"8.27\",\n" +
            "      \"percent_change_1h\": \"-0.82\",\n" +
            "      \"percent_change_7d\": \"7.24\",\n" +
            "      \"price_btc\": \"0.000009\",\n" +
            "      \"market_cap_usd\": \"30253532.44\",\n" +
            "      \"volume24\": 46396206.65043203,\n" +
            "      \"volume24a\": 25750148.793071195,\n" +
            "      \"csupply\": \"499780000.00\",\n" +
            "      \"tsupply\": \"499780000\",\n" +
            "      \"msupply\": \"1000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2732\",\n" +
            "      \"symbol\": \"GXS\",\n" +
            "      \"name\": \"GXChain\",\n" +
            "      \"nameid\": \"gxchain\",\n" +
            "      \"rank\": 86,\n" +
            "      \"price_usd\": \"0.442765\",\n" +
            "      \"percent_change_24h\": \"7.32\",\n" +
            "      \"percent_change_1h\": \"-1.31\",\n" +
            "      \"percent_change_7d\": \"41.16\",\n" +
            "      \"price_btc\": \"0.000068\",\n" +
            "      \"market_cap_usd\": \"28779719.63\",\n" +
            "      \"volume24\": 944878.2857411029,\n" +
            "      \"volume24a\": 551315.735609868,\n" +
            "      \"csupply\": \"65000000.00\",\n" +
            "      \"tsupply\": \"100000000\",\n" +
            "      \"msupply\": \"100000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33548\",\n" +
            "      \"symbol\": \"NEX\",\n" +
            "      \"name\": \"Nash Exchange\",\n" +
            "      \"nameid\": \"nash-exchange\",\n" +
            "      \"rank\": 87,\n" +
            "      \"price_usd\": \"0.781746\",\n" +
            "      \"percent_change_24h\": \"18.75\",\n" +
            "      \"percent_change_1h\": \"0.42\",\n" +
            "      \"percent_change_7d\": \"15.30\",\n" +
            "      \"price_btc\": \"0.000120\",\n" +
            "      \"market_cap_usd\": \"28296621.19\",\n" +
            "      \"volume24\": 3189639.0204439503,\n" +
            "      \"volume24a\": 4010875.546112655,\n" +
            "      \"csupply\": \"36196678.00\",\n" +
            "      \"tsupply\": \"56296100\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32238\",\n" +
            "      \"symbol\": \"WAX\",\n" +
            "      \"name\": \"WAX\",\n" +
            "      \"nameid\": \"wax\",\n" +
            "      \"rank\": 88,\n" +
            "      \"price_usd\": \"0.029399\",\n" +
            "      \"percent_change_24h\": \"1.27\",\n" +
            "      \"percent_change_1h\": \"0.97\",\n" +
            "      \"percent_change_7d\": \"-6.58\",\n" +
            "      \"price_btc\": \"0.000005\",\n" +
            "      \"market_cap_usd\": \"27718268.19\",\n" +
            "      \"volume24\": 98910.82586294912,\n" +
            "      \"volume24a\": 101484.46708562515,\n" +
            "      \"csupply\": \"942821662.00\",\n" +
            "      \"tsupply\": \"1850000000\",\n" +
            "      \"msupply\": \"1850000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2731\",\n" +
            "      \"symbol\": \"AE\",\n" +
            "      \"name\": \"Aeternity\",\n" +
            "      \"nameid\": \"aeternity\",\n" +
            "      \"rank\": 89,\n" +
            "      \"price_usd\": \"0.097127\",\n" +
            "      \"percent_change_24h\": \"2.98\",\n" +
            "      \"percent_change_1h\": \"0.30\",\n" +
            "      \"percent_change_7d\": \"-0.37\",\n" +
            "      \"price_btc\": \"0.000015\",\n" +
            "      \"market_cap_usd\": \"27227916.17\",\n" +
            "      \"volume24\": 9137472.179435473,\n" +
            "      \"volume24a\": 6795513.883223528,\n" +
            "      \"csupply\": \"280333087.00\",\n" +
            "      \"tsupply\": \"280333087\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32390\",\n" +
            "      \"symbol\": \"REN\",\n" +
            "      \"name\": \"Republic Protocol\",\n" +
            "      \"nameid\": \"republic-protocol\",\n" +
            "      \"rank\": 90,\n" +
            "      \"price_usd\": \"0.045239\",\n" +
            "      \"percent_change_24h\": \"8.91\",\n" +
            "      \"percent_change_1h\": \"0.04\",\n" +
            "      \"percent_change_7d\": \"15.22\",\n" +
            "      \"price_btc\": \"0.000007\",\n" +
            "      \"market_cap_usd\": \"26612331.28\",\n" +
            "      \"volume24\": 1035386.6999766427,\n" +
            "      \"volume24a\": 629879.6013363929,\n" +
            "      \"csupply\": \"588261205.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": null\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"258\",\n" +
            "      \"symbol\": \"MANA\",\n" +
            "      \"name\": \"Decentraland\",\n" +
            "      \"nameid\": \"decentraland\",\n" +
            "      \"rank\": 91,\n" +
            "      \"price_usd\": \"0.025074\",\n" +
            "      \"percent_change_24h\": \"-1.46\",\n" +
            "      \"percent_change_1h\": \"0.72\",\n" +
            "      \"percent_change_7d\": \"0.55\",\n" +
            "      \"price_btc\": \"0.000004\",\n" +
            "      \"market_cap_usd\": \"26331315.18\",\n" +
            "      \"volume24\": 18430866.76368093,\n" +
            "      \"volume24a\": 20925831.699114043,\n" +
            "      \"csupply\": \"1050141509.00\",\n" +
            "      \"tsupply\": \"2644403343\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32342\",\n" +
            "      \"symbol\": \"NPXS\",\n" +
            "      \"name\": \"Pundi X\",\n" +
            "      \"nameid\": \"pundi-x\",\n" +
            "      \"rank\": 92,\n" +
            "      \"price_usd\": \"0.000111\",\n" +
            "      \"percent_change_24h\": \"2.18\",\n" +
            "      \"percent_change_1h\": \"0.58\",\n" +
            "      \"percent_change_7d\": \"2.03\",\n" +
            "      \"price_btc\": \"1.71E-8\",\n" +
            "      \"market_cap_usd\": \"26161885.56\",\n" +
            "      \"volume24\": 792816.6270032112,\n" +
            "      \"volume24a\": 712193.579896891,\n" +
            "      \"csupply\": \"235171468515.00\",\n" +
            "      \"tsupply\": \"280255193861\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"120\",\n" +
            "      \"symbol\": \"STRAT\",\n" +
            "      \"name\": \"Stratis\",\n" +
            "      \"nameid\": \"stratis\",\n" +
            "      \"rank\": 93,\n" +
            "      \"price_usd\": \"0.260407\",\n" +
            "      \"percent_change_24h\": \"11.24\",\n" +
            "      \"percent_change_1h\": \"3.64\",\n" +
            "      \"percent_change_7d\": \"2.57\",\n" +
            "      \"price_btc\": \"0.000040\",\n" +
            "      \"market_cap_usd\": \"25970124.61\",\n" +
            "      \"volume24\": 563988.362065265,\n" +
            "      \"volume24a\": 403506.044467018,\n" +
            "      \"csupply\": \"99729045.00\",\n" +
            "      \"tsupply\": \"99729045\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32338\",\n" +
            "      \"symbol\": \"WICC\",\n" +
            "      \"name\": \"WaykiChain\",\n" +
            "      \"nameid\": \"waykichain\",\n" +
            "      \"rank\": 94,\n" +
            "      \"price_usd\": \"0.137156\",\n" +
            "      \"percent_change_24h\": \"1.04\",\n" +
            "      \"percent_change_1h\": \"1.32\",\n" +
            "      \"percent_change_7d\": \"-9.49\",\n" +
            "      \"price_btc\": \"0.000021\",\n" +
            "      \"market_cap_usd\": \"25922481.06\",\n" +
            "      \"volume24\": 661532.3867792167,\n" +
            "      \"volume24a\": 844169.4645043731,\n" +
            "      \"csupply\": \"189000000.00\",\n" +
            "      \"tsupply\": \"210000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"166\",\n" +
            "      \"symbol\": \"RLC\",\n" +
            "      \"name\": \"iExec RLC\",\n" +
            "      \"nameid\": \"rlc\",\n" +
            "      \"rank\": 95,\n" +
            "      \"price_usd\": \"0.302715\",\n" +
            "      \"percent_change_24h\": \"5.04\",\n" +
            "      \"percent_change_1h\": \"-0.16\",\n" +
            "      \"percent_change_7d\": \"7.10\",\n" +
            "      \"price_btc\": \"0.000047\",\n" +
            "      \"market_cap_usd\": \"24238658.48\",\n" +
            "      \"volume24\": 385609.4991282118,\n" +
            "      \"volume24a\": 307995.2434763852,\n" +
            "      \"csupply\": \"80070793.00\",\n" +
            "      \"tsupply\": \"86999785\",\n" +
            "      \"msupply\": \" 87000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"264\",\n" +
            "      \"symbol\": \"RCN\",\n" +
            "      \"name\": \"Ripio Credit Network\",\n" +
            "      \"nameid\": \"ripiocreditnetwork\",\n" +
            "      \"rank\": 96,\n" +
            "      \"price_usd\": \"0.048950\",\n" +
            "      \"percent_change_24h\": \"-3.51\",\n" +
            "      \"percent_change_1h\": \"-0.19\",\n" +
            "      \"percent_change_7d\": \"19.62\",\n" +
            "      \"price_btc\": \"0.000008\",\n" +
            "      \"market_cap_usd\": \"24148785.38\",\n" +
            "      \"volume24\": 374329.59179487615,\n" +
            "      \"volume24a\": 340906.01283979474,\n" +
            "      \"csupply\": \"493330791.00\",\n" +
            "      \"tsupply\": \"999942647\",\n" +
            "      \"msupply\": \"1000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2781\",\n" +
            "      \"symbol\": \"LRC\",\n" +
            "      \"name\": \"Loopring\",\n" +
            "      \"nameid\": \"loopring\",\n" +
            "      \"rank\": 97,\n" +
            "      \"price_usd\": \"0.026586\",\n" +
            "      \"percent_change_24h\": \"1.19\",\n" +
            "      \"percent_change_1h\": \"1.22\",\n" +
            "      \"percent_change_7d\": \"-3.33\",\n" +
            "      \"price_btc\": \"0.000004\",\n" +
            "      \"market_cap_usd\": \"23882237.61\",\n" +
            "      \"volume24\": 2203661.7517227456,\n" +
            "      \"volume24a\": 2235347.9185295724,\n" +
            "      \"csupply\": \"898304697.00\",\n" +
            "      \"tsupply\": \"1374956262\",\n" +
            "      \"msupply\": \"1395076055\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33536\",\n" +
            "      \"symbol\": \"MATIC\",\n" +
            "      \"name\": \"Matic Network\",\n" +
            "      \"nameid\": \"matic-network\",\n" +
            "      \"rank\": 98,\n" +
            "      \"price_usd\": \"0.010955\",\n" +
            "      \"percent_change_24h\": \"2.20\",\n" +
            "      \"percent_change_1h\": \"0.86\",\n" +
            "      \"percent_change_7d\": \"-0.77\",\n" +
            "      \"price_btc\": \"0.000002\",\n" +
            "      \"market_cap_usd\": \"23828608.91\",\n" +
            "      \"volume24\": 8459194.65344842,\n" +
            "      \"volume24a\": 7781890.235125479,\n" +
            "      \"csupply\": \"2175190262.00\",\n" +
            "      \"tsupply\": \"10000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33764\",\n" +
            "      \"symbol\": \"RIF\",\n" +
            "      \"name\": \"RIF Token\",\n" +
            "      \"nameid\": \"rif-token\",\n" +
            "      \"rank\": 99,\n" +
            "      \"price_usd\": \"0.049836\",\n" +
            "      \"percent_change_24h\": \"6.87\",\n" +
            "      \"percent_change_1h\": \"0.52\",\n" +
            "      \"percent_change_7d\": \"7.27\",\n" +
            "      \"price_btc\": \"0.000008\",\n" +
            "      \"market_cap_usd\": \"23820559.53\",\n" +
            "      \"volume24\": 10838702.337008525,\n" +
            "      \"volume24a\": 7791202.605043157,\n" +
            "      \"csupply\": \"477980957.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"95\",\n" +
            "      \"symbol\": \"MAID\",\n" +
            "      \"name\": \"MaidSafeCoin\",\n" +
            "      \"nameid\": \"maidsafecoin\",\n" +
            "      \"rank\": 100,\n" +
            "      \"price_usd\": \"0.052497\",\n" +
            "      \"percent_change_24h\": \"-5.06\",\n" +
            "      \"percent_change_1h\": \"0.17\",\n" +
            "      \"percent_change_7d\": \"-4.38\",\n" +
            "      \"price_btc\": \"0.000008\",\n" +
            "      \"market_cap_usd\": \"23757473.04\",\n" +
            "      \"volume24\": 161194.9410392086,\n" +
            "      \"volume24a\": 138360.88905009627,\n" +
            "      \"csupply\": \"452552412.00\",\n" +
            "      \"tsupply\": \"452552412\",\n" +
            "      \"msupply\": \"\"\n" +
            "    }\n" +
            "  ],\n" +
            "  \"info\": {\n" +
            "    \"coins_num\": 3983,\n" +
            "    \"time\": 1585645530\n" +
            "  }\n" +
            "}";

}