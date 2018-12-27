# 行为录制、回放

- 目前不支持弹出新window后的录制、key事件。仅支持通过activity分发出的事件的录制、回放。
- 为了解决activity之间的跳转，粗暴的在`onBackPressed`中认为点了返回键。同时也粗暴的认为，点击返回键产生的效果就是finish。
- 目前的效果并没有想到很好的应用场景！！！ 只是单纯觉得好玩
- 闲鱼、淘宝也有类似的产品，不知道他们的实现原理。该项目没有借鉴他们。

![](https://github.com/kaikaixue/PlaybackOP/blob/master/img/thisapp.gif)
