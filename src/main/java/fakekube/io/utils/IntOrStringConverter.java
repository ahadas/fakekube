package fakekube.io.utils;

import java.lang.reflect.Type;

import javax.json.JsonValue;
import javax.json.stream.JsonGenerator;

import org.apache.johnzon.mapper.MappingGenerator;
import org.apache.johnzon.mapper.MappingParser;
import org.apache.johnzon.mapper.ObjectConverter;

import io.kubernetes.client.custom.IntOrString;

public class IntOrStringConverter implements ObjectConverter.Codec<IntOrString> {

	@Override
	public IntOrString fromJson(JsonValue jsonValue, Type targetType, MappingParser parser) {
		switch(jsonValue.getValueType()) {
		case NUMBER:
			Integer i = parser.readObject(jsonValue, Integer.class);
			return new IntOrString(i);
		default:
			String s = parser.readObject(jsonValue, String.class);
			return new IntOrString(s);
		}
	}

	@Override
	public void writeJson(IntOrString instance, MappingGenerator jsonbGenerator) {
		JsonGenerator generator = jsonbGenerator.getJsonGenerator();
		if (instance.isInteger())
			generator.write(instance.getIntValue());
		else
			generator.write(instance.getStrValue());
	}
}
