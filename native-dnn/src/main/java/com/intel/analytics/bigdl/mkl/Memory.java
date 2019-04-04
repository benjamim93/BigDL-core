/*
 * Copyright 2016 The BigDL Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.intel.analytics.bigdl.mkl;

public class Memory {
    static {
        MklDnn.isLoaded();
    }

    public static class Format {
        public static final int format_undef = 0;
        public static final int any = 1;
        public static final int blocked = 2;
        public static final int x = 3;
        public static final int nc = 4;
        public static final int ncw = 5;
        public static final int nwc = 6;
        public static final int nchw = 7;
        public static final int nhwc = 8;
        public static final int chwn = 9;
        public static final int ncdhw = 10;
        public static final int ndhwc = 11;
        public static final int oi = 12;
        public static final int io = 13;
        public static final int oiw = 14;
        public static final int wio = 15;
        public static final int oihw = 16;
        public static final int hwio = 17;
        public static final int ihwo = 18;
        public static final int iohw = 19;
        public static final int oidhw = 20;
        public static final int dhwio = 21;
        public static final int goiw = 22;
        public static final int goihw = 23;
        public static final int hwigo = 24;
        public static final int giohw = 25;
        public static final int goidhw = 26;
        public static final int ntc = 27;
        public static final int tnc = 28;
        public static final int ldsnc = 29;
        public static final int ldigo = 30;
        public static final int ldgoi = 31;
        public static final int ldgo = 32;
        public static final int nCw8c = 33;
        public static final int nCw16c = 34;
        public static final int nChw8c = 35;
        public static final int nChw16c = 36;
        public static final int nCdhw8c = 37;
        public static final int nCdhw16c = 38;
        public static final int Owi8o = 39;
        public static final int OIw8i8o = 40;
        public static final int OIw8o8i = 41;
        public static final int OIw16i16o = 42;
        public static final int OIw16o16i = 43;
        public static final int Oiw16o = 44;
        public static final int Owi16o = 45;
        public static final int OIw8i16o2i = 46;
        public static final int OIw8o16i2o = 47;
        public static final int IOw16o16i = 48;
        public static final int hwio_s8s8 = 49;
        public static final int oIhw8i = 50;
        public static final int oIhw16i = 51;
        public static final int OIhw8i8o = 52;
        public static final int OIhw16i16o = 53;
        public static final int OIhw4i16o4i = 54;
        public static final int OIhw4i16o4i_s8s8 = 55;
        public static final int OIhw8i16o2i = 56;
        public static final int OIhw8o16i2o = 57;
        public static final int OIhw8o8i = 58;
        public static final int OIhw16o16i = 59;
        public static final int IOhw16o16i = 60;
        public static final int Oihw8o = 61;
        public static final int Oihw16o = 62;
        public static final int Ohwi8o = 63;
        public static final int Ohwi16o = 64;
        public static final int OhIw16o4i = 65;
        public static final int oIdhw8i = 66;
        public static final int oIdhw16i = 67;
        public static final int OIdhw8i8o = 68;
        public static final int OIdhw8o8i = 69;
        public static final int Odhwi8o = 70;
        public static final int OIdhw16i16o = 71;
        public static final int OIdhw16o16i = 72;
        public static final int Oidhw16o = 73;
        public static final int Odhwi16o = 74;
        public static final int OIdhw8i16o2i = 75;
        public static final int gOwi8o = 76;
        public static final int gOIw8o8i = 77;
        public static final int gOIw8i8o = 78;
        public static final int gOIw16i16o = 79;
        public static final int gOIw16o16i = 80;
        public static final int gOiw16o = 81;
        public static final int gOwi16o = 82;
        public static final int gOIw8i16o2i = 83;
        public static final int gOIw8o16i2o = 84;
        public static final int gIOw16o16i = 85;
        public static final int hwigo_s8s8 = 86;
        public static final int gOIhw8i8o = 87;
        public static final int gOIhw16i16o = 88;
        public static final int gOIhw4i16o4i = 89;
        public static final int gOIhw4i16o4i_s8s8 = 90;
        public static final int gOIhw8i16o2i = 91;
        public static final int gOIhw8o16i2o = 92;
        public static final int gOIhw8o8i = 93;
        public static final int gOIhw16o16i = 94;
        public static final int gIOhw16o16i = 95;
        public static final int gOihw8o = 96;
        public static final int gOihw16o = 97;
        public static final int gOhwi8o = 98;
        public static final int gOhwi16o = 99;
        public static final int Goihw8g = 100;
        public static final int Goihw16g = 101;
        public static final int Goihw16g_s8s8 = 102;
        public static final int gOhIw16o4i = 103;
        public static final int gOIdhw8i8o = 104;
        public static final int gOIdhw8o8i = 105;
        public static final int gOdhwi8o = 106;
        public static final int gOIdhw8i16o2i = 107;
        public static final int gOIdhw16i16o = 108;
        public static final int gOIdhw16o16i = 109;
        public static final int gOidhw16o = 110;
        public static final int gOdhwi16o = 111;
        public static final int wino_fmt = 112;
        public static final int rnn_packed = 113;
        public static final int format_last = 114;
    }

    public native static long SetDataHandle(long memoryPrimitive, long data, int offset);
    public native static long Zero(long data, int length, int elementSize);
    // TODO use override methods
    public native static long CopyPtr2Ptr(long src, int srcOffset, long dst, int dstOffset,
                                          int length, int elementSize);
    public native static long CopyArray2Ptr(float[] src, int srcOffset, long dst, int dstOffset,
                                            int length, int elementSize);
    public native static long CopyPtr2Array(long src, int srcOffset, float[] dst, int dstOffset,
                                            int length, int elementSize);

    public native static long CopyPtr2ByteArray(long src, int srcOffset, byte[] dst, int dstOffset,
                                                int length, int elementSize);

    public native static long CopyPtr2IntArray(long src, int srcOffset, int[] dst, int dstOffset,
                                                int length, int elementSize);

    public native static long AlignedMalloc(int capacity, int size);
    public native static void AlignedFree(long ptr);

    public native static void SAdd(int n, long aPtr, int aOffset, long bPtr, int bOffset,
                                    long yPtr, int yOffset);

    public native static void Scale(int n, float scaleFactor, long from, long to);
    public native static void Axpby(int n, float a, long x, float b, long y);
    public native static void Set(long data, float value, int length, int elementSize);

    public native static int[] GetShape(long desc);
    public native static int[] GetPaddingShape(long desc);
    public native static int GetLayout(long desc);
    public native static int GetDataType(long desc);
    public native static long GetSize(long desc);
}
