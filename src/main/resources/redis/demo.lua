local key1 = KEYS[1]
local value = ARGV[2]
local vv = ARGV[1]
local time = tonumber(ARGV[3])
redis.call('hset',key1,vv,value)
redis.call('expire',key1,time)