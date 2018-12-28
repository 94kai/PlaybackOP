# 行为录制、回放

- 代码量少、原理简单、仅适用于瞎玩
- 为方便，motionevent直接存内存，motionevent不支持序列化到本地。可以提取关键信息（位置、action等），写入到文件中，通过硬盘、网络传播
- 目前不支持弹出新window后的录制、key事件。仅支持通过activity分发出的事件的录制、回放。
- 为了解决activity之间的跳转，粗暴的在`onBackPressed`中认为点了返回键。同时也粗暴的认为，点击返回键产生的效果就是finish。
- 目前的效果并没有想到很好的应用场景！！！ 只是单纯觉得好玩
- 闲鱼、淘宝也有类似的产品，不知道他们的实现原理。该项目没有借鉴他们。

![](https://github.com/kaikaixue/PlaybackOP/blob/master/img/kaiyan.gif)

图一该项目地址
https://github.com/kaikaixue/Eyepetizer



![](https://github.com/kaikaixue/PlaybackOP/blob/master/img/thisapp.gif)
