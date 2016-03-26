package com.example

import com.xuggle.mediatool.{IMediaReader, IMediaViewer, ToolFactory}

object Hello {
  def main(args: Array[String]): Unit = {
    val reader: IMediaReader = ToolFactory.makeReader("assets/severestormovermandurahmp4.mp4")
    reader.addListener(ToolFactory.makeViewer(IMediaViewer.Mode.FAST_VIDEO_ONLY))

    while (reader.readPacket() == null) {
      println(reader.getUrl)
    }
    println("end")
  }
}
