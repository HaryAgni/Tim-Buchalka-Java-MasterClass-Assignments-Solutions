public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        double wallArea =0;
        int totalBuckets  =0;
        int bucketsRequired = 0;
        if (width<=0||height<=0||areaPerBucket<=0||extraBuckets<0)return -1;

        wallArea = width * height;
        totalBuckets =(int)Math.ceil(wallArea/areaPerBucket);
        bucketsRequired = totalBuckets-extraBuckets;
        return bucketsRequired;


    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        double wallArea = 0;
        if (width<=0||height<=0||areaPerBucket<=0){
            return -1;
        }
        else {
            wallArea = width * height;
            int buckets = (int)Math.ceil(wallArea/areaPerBucket);
            return buckets;
        }
    }
    public static int getBucketCount(double area, double areaPerBucket){
        if (area<=0||areaPerBucket<=0)return -1;
        else {
            double reqBucket = area / areaPerBucket;
            int buckets = (int) Math.ceil(reqBucket);
            return buckets;
        }


    }

}
