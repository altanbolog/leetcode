package leetcode.algorithms;

/**
 * Description: 1283. Find the Smallest Divisor Given a Threshold
 *
 * @author Baltan
 * @date 2019-12-12 08:56
 */
public class SmallestDivisor {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 5, 9};
        System.out.println(smallestDivisor(nums1, 6));

        int[] nums2 = {2, 3, 5, 7, 11};
        System.out.println(smallestDivisor(nums2, 11));

        int[] nums3 = {19};
        System.out.println(smallestDivisor(nums3, 5));

        int[] nums4 = {134472, 307981, 242985, 654527, 955840, 632108, 900623, 995266, 71687, 306036, 945300,
                951599, 542263, 977635, 347623, 856289, 681188, 601083, 470509, 454993, 152343, 409659,
                121954, 341572, 633728, 48156, 212838, 385665, 321423, 38135, 37059, 972113, 537032, 193415,
                734084, 563311, 109963, 729639, 16828, 959255, 551051, 47289, 924481, 828064, 549189, 747075,
                386591, 10841, 630268, 734691, 963174, 258084, 166115, 629547, 662751, 969570, 783137, 331024,
                319628, 441024, 436095, 322214, 870665, 445763, 125435, 625422, 398538, 846541, 2767, 718091,
                395597, 290490, 1864, 145771, 638824, 179978, 173447, 357817, 337197, 266159, 583993, 165217,
                342895, 271023, 318003, 7634, 222230, 436757, 460750, 542548, 574199, 817228, 651464, 672996,
                67700, 362803, 19883, 570574, 575006, 680092, 28748, 307955, 931296, 341184, 992413, 791765,
                604730, 155146, 418775, 608374, 109409, 138709, 509788, 38335, 497370, 540407, 755923, 278168,
                893004, 55810, 222614, 282112, 605758, 529279, 718275, 632851, 888711, 497778, 913296, 726288,
                987648, 500613, 516526, 406455, 784126, 46579, 537308, 558812, 89840, 208386, 248815, 838528,
                921368, 762521, 11967, 79616, 307149, 432412, 798434, 200445, 814259, 201349, 936125, 919867,
                929989, 485058, 619979, 633318, 730022, 353482, 382983, 738574, 772800, 487985, 659100,
                445751, 570792, 945534, 705044, 10414, 353202, 52463, 193486, 825463, 192685, 969540, 408152,
                215082, 542662, 761437, 216823, 762929, 821457, 567562, 662945, 362536, 294434, 110478,
                912681, 68679, 998119, 549239, 201738, 986914, 406166, 666781, 394718, 334482, 890905, 339751,
                181524, 299217, 416690, 930527, 827758, 378730, 73229, 312722, 370365, 939016, 808925, 440368,
                479266, 996297, 950225, 183128, 478589, 548788, 331373, 264191, 672510, 445999, 594301,
                819354, 620736, 41902, 233523, 560606, 903405, 563466, 418884, 83750, 996775, 963151, 643403,
                987821, 672083, 194779, 55970, 555370, 984174, 788128, 874860, 284248, 810887, 110646, 578012,
                971076, 474725, 86569, 104468, 946560, 683195, 156997, 671716, 562390, 510984, 815384, 925945,
                743175, 685825, 716987, 803732, 870556, 772537, 466975, 946504, 220371, 67540, 242117, 771063,
                492412, 611448, 101746, 30166, 79470, 834708, 268302, 174470, 149896, 762374, 875815, 48905,
                620046, 176431, 452436, 751720, 456730, 979932, 561757, 680074, 79729, 169893, 466702, 574842,
                688335, 435694, 384587, 301692, 120436, 518912, 411347, 475150, 2640, 742324, 798254, 822284,
                152198, 621904, 776432, 796775, 239528, 819968, 881274, 633928, 989640, 236660, 326129,
                682822, 659925, 483160, 55369, 457226, 45249, 644523, 869022, 167620, 71356, 201558, 676785,
                703608, 550696, 702033, 865541, 539243, 870517, 395227, 84436, 438100, 796766, 972696, 519608,
                382813, 571887, 688386, 223306, 301816, 821780, 777411, 765277, 272419, 800853, 4208, 906420,
                947538, 410771, 163078, 105943, 817680, 115936, 708274, 508540, 382246, 21739, 86255, 676263,
                109717, 550933, 663110, 193232, 919345, 655967, 758328, 740471, 407347, 72235, 148172, 505626,
                322341, 735162, 650249, 357766, 742146, 33507, 738905, 247245, 932060, 133977, 562316, 757980,
                721170, 544685, 872710, 628670, 457160, 358512, 28558, 725066, 364701, 309362, 64622, 294956,
                920591, 314166, 815528, 631975, 571492, 751384, 111077, 467767, 781689, 273204, 865387, 97458,
                832026, 219464, 904123, 541374, 148304, 548357, 895786, 532669, 453370, 959041, 229659,
                376901, 250207, 689368, 605213, 620423, 214642, 419509, 584149, 123078, 725735, 750389,
                304505, 981694, 934980, 136203, 737831, 725390, 861238, 154688, 749184, 925874, 387351,
                253201, 685922, 487567, 643113, 98999, 71470, 901722, 775960, 480272, 538910, 555533, 369369,
                488342, 629226, 190032, 106148, 336773, 26678, 475164, 842651, 19449, 977964, 724875, 506251,
                486835, 761189, 484653, 180528, 654045, 989521, 265748, 236394, 652147, 85399, 53933, 465278,
                569142, 396418, 135358, 85179, 902235, 650124, 364135, 960721, 979319, 860603, 586588, 898695,
                537825, 895012, 315813, 316977, 382459, 95467, 463669, 540337, 273546, 625782, 207710, 985258,
                998269, 945134, 469699, 933318, 112153, 295153, 489388, 874322, 224074, 946016, 825566,
                748680, 655467, 636987, 281191, 769617, 50027, 528654, 992458, 132632, 92107, 630027, 226864,
                575166, 858583, 203845, 726829, 633208, 296100, 450329, 453442, 447093, 473478, 892533,
                585383, 747946, 318870, 162037, 944215, 473316, 808876, 190875, 394382, 617394, 741139,
                241818, 98858, 830531, 572716, 628852, 56405, 990448, 282760, 534150, 733344, 561869, 369168,
                333701, 436531, 389817, 329149, 385697, 326463, 209557, 124993, 369847, 982921, 597854,
                925787, 778277, 459074, 133485, 502499, 208513, 223305, 302335, 268028, 670031, 584615,
                331555, 494069, 280036, 324408, 68831, 919795, 570589, 548050, 414759, 382616, 84621, 482585,
                121889, 428920, 896957, 395333, 55131, 539032, 562015, 924779, 581403, 880956, 637636, 872078,
                846731, 218998, 731569, 644724, 574310, 508269, 301586, 476942, 776610, 854594, 982573, 81711,
                606400, 742198, 897808, 862771, 380362, 40492, 162574, 728333, 281863, 730233, 532922, 657864,
                419865, 211877, 843702, 39772, 404211, 928444, 731115, 473103, 693958, 196635, 834781, 717411,
                489758, 502486, 29865, 603137, 343160, 792651, 798091, 295741, 193946, 225600, 606646, 993419,
                241033, 990778, 763511, 922148, 308352, 683374, 266189, 757221, 662474, 30760, 747468, 652753,
                290334, 115189, 503762, 301420, 177102, 580334, 145709, 999285, 923699, 210094, 896214,
                109471, 143009, 691693, 297398, 229522, 449123, 104560, 836820, 971261, 111949, 338851,
                141552, 573104, 647434, 752900, 650652, 168921, 620378, 87446, 442390, 730746, 932995, 997330,
                29661, 888742, 191241, 828209, 777024, 614095, 502524, 37724, 691232, 559946, 567849, 132455,
                309676, 548090, 459443, 918506, 401508, 994157, 776244, 13417, 521004, 122222, 985859, 319619,
                738857, 564459, 405414, 775287, 694044, 244736, 406078, 818311, 348432, 937552, 600193,
                645157, 802930, 771498, 590580, 501416, 248129, 365576, 194606, 37648, 318760, 13829, 320128,
                126363, 849193, 215572, 230844, 253811, 990163, 473607, 689942, 835644, 532764, 871698,
                262053, 843228, 731711, 111421, 743445, 841872, 816418, 426255, 354822, 944584, 11824, 774713,
                104566, 762015, 282919, 701515, 135076, 198847, 722680, 560387, 198328, 824607, 535277,
                206250, 286872, 407716, 198271, 865760, 469408, 804176, 41806, 874432, 799782, 142319, 676811,
                499216, 701724, 998397, 263197, 853587, 692086, 342638, 158061, 694699, 251590, 726172, 51129,
                493640, 237122, 20157, 616242, 57227, 412186, 429027, 130896, 138074, 303301, 527404, 580456,
                203970, 512651, 411869, 28154, 999952, 896455, 889742, 165930, 684721, 994802, 860946, 252372,
                38841, 17483, 507403, 295610, 912363, 172949, 839215, 796236, 152975, 240597, 896623, 343417,
                691520, 389632, 92690, 189531, 535092, 959883, 771366, 501918, 20453, 706260, 819764, 964564,
                985651, 380794, 321432, 294437, 791942, 622572, 719699, 435357, 222029, 457114, 686311,
                609426, 364004, 772975, 88884, 63157, 644748, 908860, 560433, 281933, 20996, 934242, 754877,
                688979, 159822, 150193, 381164, 651041, 402777, 222858, 769834, 931856, 9365, 145548, 968321,
                284084, 84078, 605524, 260859, 107018, 829292, 311838, 368321, 245985, 933097, 435793, 657263,
                642995, 253214, 71633, 168489, 15967, 645506, 161991, 816576, 924379, 48762, 848025, 576629,
                852660, 23936, 183779, 241918, 954927, 662009, 412152, 319837, 268575, 582917, 763437, 209788,
                859907, 303874, 925949, 357733, 629414, 918645, 514552, 559518, 582019, 588629, 210041,
                591849, 859076, 468522, 25117, 812748, 184826, 927208, 51400, 709139, 595904, 41404, 882126,
                117341, 257366, 378775, 295124, 178634, 94768, 32627, 934854, 907828, 708518, 299911, 236366,
                36304, 202981, 243118, 301959, 380714, 582472, 64461, 155403, 520759, 175262, 477980, 416682,
                92338, 106653, 118208, 685583, 257168, 480285, 26008, 689729, 558302, 934027, 717797, 381600,
                738554, 625538, 725551, 140518, 333753, 286580, 729336, 592888, 289055, 958138, 528630,
                853015, 370725};
        System.out.println(smallestDivisor(nums4, 2029));
    }

    public static int smallestDivisor(int[] nums, int threshold) {
        long sum = 0L;
        /**
         * 除数可能的上限为数组中的最大值，当除数大于等于该值时，求和结果恒为数组长度length
         */
        int hi = 0;

        for (int num : nums) {
            hi = Math.max(hi, num);
            sum += num;
        }
        /**
         * 除数可能的下限，因为ceil((a1+a2+……+ai)/n)<=ceil(a1/n)+ceil(a1/n)+……+ceil(ai/n)<=threshold
         */
        int lo = (int) Math.ceil(1.0 * sum / threshold);
        /**
         * 二分查找满足要求的最小除数
         */
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            int currentSum = 0;

            for (int num : nums) {
                currentSum += Math.ceil(1.0 * num / mid);
            }
            /**
             * 如果当前求和结果大于阈值，说明除数不够大，否则说明除数可能还能更小
             */
            if (currentSum > threshold) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }
}