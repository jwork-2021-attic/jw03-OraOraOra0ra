# W03

191220102    孙文戈





### 1.

首先通过SteganographyFactory读入排序类将其编译获得class文件，接着SteganographyEncoder中通过读取class文件将其字节码、名称、文件大小等信息写入bytes数组中，将bytes数组写入图片的rgb值中并重新存进图片，便达到了将class文件编码进原图片获得隐写术图的目的。

然后通过Scene中SteganographyClassLoader的调用获得隐写术图的url，再次调用SteganographyEncoder以解码图片获得存进的bytes数组，便可获得编译好的排序类信息，接着调用即可。



### 2.

##### 选择排序;

https://github.com/jwork-2021/jw03-OraOraOra0ra/blob/main/example.SelectSorter.png

##### 快速排序：

https://github.com/jwork-2021/jw03-OraOraOra0ra/blob/main/example.QuickSorter.png





### 3.

##### 选择排序

[![asciicast](https://asciinema.org/a/vLXlEZavS2E9lsRBP2PDjUSBp.svg)](https://asciinema.org/a/vLXlEZavS2E9lsRBP2PDjUSBp)

##### 快速排序：

[![asciicast](https://asciinema.org/a/Ydwoh5t8HnOQFspIIK7hram3N.svg)](https://asciinema.org/a/Ydwoh5t8HnOQFspIIK7hram3N)





### 4.

使用了191220046蒋梓栩的选择排序，结果正确

[![asciicast](https://asciinema.org/a/XuOqPNPFlb0YtlZrd0PqgpfQ8.svg)](https://asciinema.org/a/XuOqPNPFlb0YtlZrd0PqgpfQ8)

