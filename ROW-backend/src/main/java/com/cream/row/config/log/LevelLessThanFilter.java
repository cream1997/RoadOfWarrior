package com.cream.row.config.log;


import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.filter.AbstractMatcherFilter;
import ch.qos.logback.core.spi.FilterReply;
import lombok.Setter;

/**
 * 仿照着logback的ThresholdFilter，实现日志级别过滤
 */
@Setter
public class LevelLessThanFilter extends AbstractMatcherFilter<ILoggingEvent> {

    Level level;

    @Override
    public FilterReply decide(ILoggingEvent event) {
        if (!isStarted()) {
            return FilterReply.NEUTRAL;
        }
        if (event.getLevel().levelInt <= level.levelInt) {
            return FilterReply.NEUTRAL;
        } else {
            return FilterReply.DENY;
        }
    }

    public void start() {
        if (this.level != null) {
            super.start();
        }
    }
}
