package com.crop.market_palce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class DataController {
	
	 CropPrice cropPrice = new CropPrice(
	            "C001",                 // id
	            "Mandi A",              // mandiName1
	            "Mandi B",              // mandiName2
	            "Mandi C",              // mandiName3
	            "Mandi D",              // mandiName4
	            "Mandi E",              // mandiName5
	            "Mandi F",              // mandiName6
	            "Mandi G",              // mandiName7
	            "Mandi H",              // mandiName8
	            100,                    // p1
	            200,                    // p2
	            300,                    // p3
	            400,                    // p4
	            500,                    // p5
	            600,                    // p6
	            700,                    // p7
	            800                     // p8
	        );
	 CropPrice cropPrice1 = new CropPrice(
			    "C002", "Mandi I", "Mandi J", "Mandi K", "Mandi L", "Mandi M", "Mandi N", "Mandi O", "Mandi P",
			    900, 2630, 310, 410, 510, 610, 710, 810
			);

			CropPrice cropPrice2 = new CropPrice(
			    "C003", "Mandi Q", "Mandi R", "Mandi S", "Mandi T", "Mandi U", "Mandi V", "Mandi W", "Mandi X",
			    120, 220, 320, 420, 520, 620, 720, 820
			);

			CropPrice cropPrice3 = new CropPrice(
			    "C004", "Mandi Y", "Mandi Z", "Mandi AA", "Mandi BB", "Mandi CC", "Mandi DD", "Mandi EE", "Mandi FF",
			    130, 230, 330, 430, 530, 630, 730, 830
			);

			CropPrice cropPrice4 = new CropPrice(
			    "C005", "Mandi GG", "Mandi HH", "Mandi II", "Mandi JJ", "Mandi KK", "Mandi LL", "Mandi MM", "Mandi NN",
			    140, 240, 340, 440, 540, 640, 740, 840
			);

			CropPrice cropPrice5 = new CropPrice(
			    "C006", "Mandi OO", "Mandi PP", "Mandi QQ", "Mandi RR", "Mandi SS", "Mandi TT", "Mandi UU", "Mandi VV",
			    150, 250, 350, 450, 550, 650, 750, 850
			);

			CropPrice cropPrice6 = new CropPrice(
			    "C007", "Mandi WW", "Mandi XX", "Mandi YY", "Mandi ZZ", "Mandi AAA", "Mandi BBB", "Mandi CCC", "Mandi DDD",
			    160, 260, 360, 460, 560, 660, 760, 860
			);

			CropPrice cropPrice7 = new CropPrice(
			    "C008", "Mandi EEE", "Mandi FFF", "Mandi GGG", "Mandi HHH", "Mandi III", "Mandi JJJ", "Mandi KKK", "Mandi LLL",
			    170, 270, 370, 470, 570, 670, 770, 870
			);

			CropPrice cropPrice8 = new CropPrice(
			    "C009", "Mandi MMM", "Mandi NNN", "Mandi OOO", "Mandi PPP", "Mandi QQQ", "Mandi RRR", "Mandi SSS", "Mandi TTT",
			    180, 280, 380, 480, 580, 680, 780, 880
			);

			CropPrice cropPrice9 = new CropPrice(
			    "C010", "Mandi UUU", "Mandi VVV", "Mandi WWW", "Mandi XXX", "Mandi YYY", "Mandi ZZZ", "Mandi AAAA", "Mandi BBBB",
			    190, 290, 390, 490, 590, 690, 790, 890
			);

			CropPrice cropPrice10 = new CropPrice(
			    "C011", "Mandi CCCC", "Mandi DDDD", "Mandi EEEE", "Mandi FFFF", "Mandi GGGG", "Mandi HHHH", "Mandi IIII", "Mandi JJJJ",
			    200, 300, 400, 500, 600, 700, 800, 900
			);

			CropPrice cropPrice11 = new CropPrice(
			    "C012", "Mandi KKKK", "Mandi LLLL", "Mandi MMMM", "Mandi NNNN", "Mandi OOOO", "Mandi PPPP", "Mandi QQQQ", "Mandi RRRR",
			    210, 310, 410, 510, 610, 710, 810, 910
			);

			CropPrice cropPrice12 = new CropPrice(
			    "C013", "Mandi SSSS", "Mandi TTTT", "Mandi UUUU", "Mandi VVVV", "Mandi WWWW", "Mandi XXXX", "Mandi YYYY", "Mandi ZZZZ",
			    220, 320, 420, 520, 620, 720, 820, 920
			);

			CropPrice cropPrice13 = new CropPrice(
			    "C014", "Mandi AAAAA", "Mandi BBBBB", "Mandi CCCCC", "Mandi DDDDD", "Mandi EEEEE", "Mandi FFFFF", "Mandi GGGGG", "Mandi HHHHH",
			    230, 330, 430, 530, 630, 730, 830, 930
			);

			CropPrice cropPrice14 = new CropPrice(
			    "C015", "Mandi IIIII", "Mandi JJJJJ", "Mandi KKKKK", "Mandi LLLLL", "Mandi MMMMM", "Mandi NNNNN", "Mandi OOOOO", "Mandi PPPPP",
			    240, 340, 440, 540, 640, 740, 840, 940
			);

			CropPrice cropPrice15 = new CropPrice(
			    "C016", "Mandi QQQQQ", "Mandi RRRRR", "Mandi SSSSS", "Mandi TTTTT", "Mandi UUUUU", "Mandi VVVVV", "Mandi WWWWW", "Mandi XXXXX",
			    250, 350, 450, 550, 650, 750, 850, 950
			);

 @GetMapping("/data")
 public List<DataModel> getData() {
     // Create some sample data
     return Arrays.asList(
    		 new DataModel(1032, "wheat",cropPrice),
    		 new DataModel(211, "rice",cropPrice1),
    		 new DataModel(234, "wheat root",cropPrice2),
    		 new DataModel(452, "barley",cropPrice3),
    		 new DataModel(678, "corn",cropPrice4),
    		 new DataModel(823, "soybean",cropPrice5),
    		 new DataModel(912, "oats",cropPrice6),
    		 new DataModel(1015, "millet",cropPrice7),
    		 new DataModel(1111, "sorghum",cropPrice8),
    		 new DataModel(1223, "quinoa",cropPrice9),
    		 new DataModel(1345, "buckwheat",cropPrice10),
    		 new DataModel(1467, "rye",cropPrice11),
    		 new DataModel(1589, "spelt",cropPrice12),
    		 new DataModel(1602, "teff",cropPrice13),
    		 new DataModel(1734, "amaranth",cropPrice14),
    		 new DataModel(1856, "triticale",cropPrice15)

     );
 }
}
